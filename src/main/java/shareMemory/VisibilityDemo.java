package shareMemory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/1
 */
public class VisibilityDemo {
    private static boolean shutdown = false;

    public static void main(String[] args) throws InterruptedException {
        new HelloThread().start();
        Thread.sleep(1000);
        shutdown = true;
        System.out.println("exit main");
    }

    static class HelloThread extends Thread {
        @Override
        public void run() {
            while (!shutdown) {
                // do nothing
            }
            System.out.println("exit hello");
        }
    }
}
