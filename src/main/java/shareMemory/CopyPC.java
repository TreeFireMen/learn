package shareMemory;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class CopyPC {
    static class MyBlockQueue<E> {
        private final Queue<E> queue;
        private final Integer limit;

        public MyBlockQueue(Integer limit) {
            this.queue = new ArrayDeque<>(limit);
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
            E take = (E) queue.poll();
            notifyAll();
            return take;
        }
    }


    static class Producer extends Thread{
        private final MyBlockQueue<String> myBlockQueue;

        public Producer(MyBlockQueue<String> myBlockQueue) {
            this.myBlockQueue = myBlockQueue;
        }
        @Override
        public void run() {
            try {
                int num = 0;
                while (true) {
                    String task = String.valueOf(num);
                    myBlockQueue.put(task);
                    System.out.println("produce " + num);
                    num ++;
                    Thread.sleep((long) (Math.random() * 100));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer extends Thread{
        private final MyBlockQueue<String> myBlockQueue;

        public Consumer(MyBlockQueue<String> myBlockQueue) {
            this.myBlockQueue = myBlockQueue;
        }


        @Override
        public synchronized void run() {
           while (true) {
               String take = null;
               try {
                   take = myBlockQueue.take();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("consumer " + take);
           }
        }
    }

    public static void main(String[] args) {
        MyBlockQueue<String> queue = new MyBlockQueue<>(10);
        new Producer(queue).start();
        new Consumer(queue).start();
    }


}
