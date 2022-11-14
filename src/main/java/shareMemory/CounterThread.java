package shareMemory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/1
 */
public class CounterThread extends Thread {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        System.out.println(counter);
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }
}
