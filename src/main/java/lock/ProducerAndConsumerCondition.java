package lock;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/3
 */
public class ProducerAndConsumerCondition {
    static class MyBlockingQueue<E> {
        private final Queue<E> queue;
        private final int limit;
        private Lock lock = new ReentrantLock();

        private Condition notFull = lock.newCondition();
        private Condition notEmpty = lock.newCondition();

        public MyBlockingQueue(int limit) {
            this.queue = new ArrayDeque<>();
            this.limit = limit;
        }

        public synchronized void put(E e) throws InterruptedException {
            lock.lockInterruptibly();
            try {
                while (queue.size() == limit) {
                    notFull.await();
                }
                queue.add(e);
                notEmpty.signalAll();
            } finally {
                lock.unlock();
            }
        }

        public synchronized E take() throws InterruptedException {
            E e;
            lock.lockInterruptibly();
            try {
                while (queue.isEmpty()) {
                    notEmpty.await();
                }
                e = queue.poll();
                notFull.signal();
                return e;
            } finally {
                lock.unlock();
            }

        }
    }

    static class Producer extends Thread {
        private final MyBlockingQueue<String> queue;

        public Producer(MyBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            int num = 0;
            try {
                while (true) {
                    String task = String.valueOf(num);
                    queue.put(task);
                    System.out.println("produce task: " + task);
                    num++;
                    Thread.sleep((int) (Math.random() * 100));
                }
            } catch (InterruptedException e) {
            }
        }
    }

    static class Consumer extends Thread {
        private MyBlockingQueue<String> queue;

        public Consumer(MyBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String task = queue.take();
                    System.out.println("consumer task: " + task);
                    Thread.sleep((int) (Math.random() * 100));
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue<String> blockingQueue = new MyBlockingQueue<>(10);
        new Producer(blockingQueue).start();
        new Consumer(blockingQueue).start();
    }
}
