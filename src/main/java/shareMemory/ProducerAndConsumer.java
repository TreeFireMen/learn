package shareMemory;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class ProducerAndConsumer {
    public static void main(String[] args) {
        MyBlockingQueue<String> blockingQueue = new MyBlockingQueue<>(10);
        new Producer(blockingQueue).start();
        new Consumer(blockingQueue).start();
    }

    static class MyBlockingQueue<E> {
        private final Queue<E> queue;
        private final int limit;

        public MyBlockingQueue(int limit) {
            this.queue = new ArrayDeque<>();
            this.limit = limit;
        }

        public synchronized void put(E e) throws InterruptedException {
            while (queue.size() == limit) {
                wait();
            }
            queue.add(e);
            notifyAll();
        }

        public synchronized E take() throws InterruptedException {
            while (queue.isEmpty()) {
                wait();
            }
            E e = queue.poll();
            notifyAll();
            return e;
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
        private final MyBlockingQueue<String> queue;

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
}
