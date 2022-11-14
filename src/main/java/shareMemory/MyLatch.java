package shareMemory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class MyLatch {

    private int count;

    public MyLatch(int count) {
        this.count = count;
    }

    public static void main(String[] args) throws InterruptedException {
        int workNum = 100;
        MyLatch latch = new MyLatch(workNum);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < workNum; i++) {
            threads[i] = new Worker(latch);
            threads[i].start();
        }
        latch.await();
        System.out.println("collect workers result");

    }

    public synchronized void await() throws InterruptedException {
        while (count > 0) {
            wait();
        }
    }

    public synchronized void countDown() {
        count--;
        if (count <= 0) {
            notifyAll();
        }
    }

    static class Worker extends Thread {
        MyLatch latch;

        public Worker(MyLatch myLatch) {
            this.latch = myLatch;
        }

        @Override
        public void run() {
            try {
                //do something
                Thread.sleep((long) (Math.random() * 100));
                latch.countDown();
            } catch (InterruptedException e) {

            }

        }
    }

}
