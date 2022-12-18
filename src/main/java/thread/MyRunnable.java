package thread;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-18
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("run...." + Thread.currentThread().getName());
    }
}
