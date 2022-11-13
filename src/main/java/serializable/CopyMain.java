package serializable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/4
 */
public class CopyMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        List<String> names = Arrays.asList("a");

        for (String name : names) {
            threadPool.submit(new Task(name));
        }

        threadPool.awaitTermination(3, TimeUnit.SECONDS);
        threadPool.shutdown();
    }

    public static class CopyUserContext {
        private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
        public CopyUserContext(String name) {
            threadLocal.set(name);
        }

        public static String getCurrentUser() {
            return threadLocal.get();
        }
    }

    class CopyTask implements Runnable {

        private String name;

        public CopyTask(String name) {
            this.name = name;
            System.out.println("init....");
        }

        @Override
        public void run() {
            CopyUserContext userContext = new CopyUserContext(name);
            new CopyTask1().process();
            new CopyTask2().process();
            new CopyTask3().process();

        }
    }
}

class CopyTask1 {
    public void process() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.printf("[%s] check user %s...\n", Thread.currentThread().getName(), CopyMain.CopyUserContext.getCurrentUser());
    }
}

class CopyTask2 {
    public void process() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.printf("[%s] registered user %s...\n", Thread.currentThread().getName(), CopyMain.CopyUserContext.getCurrentUser());
    }
}

class CopyTask3 {
    public void process() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.printf("[%s] work of %s has done\n", Thread.currentThread().getName(), CopyMain.CopyUserContext.getCurrentUser());
    }
}
