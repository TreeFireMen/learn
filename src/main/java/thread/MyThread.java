package thread;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-18
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("run..." + Thread.currentThread().getName());
        super.run();
    }

    public static void main(String[] args) {
        // 使用继承Thread的方式开启一个新线程，调用start方法
        MyThread myThread = new MyThread();
        myThread.start();
        // 而直接调用run方法是不会开启新线程的
        MyRunnable myRunnable1 = new MyRunnable();
        myRunnable1.run();
        // 使用实现Runnable接口的方式开启一个新线程，也是调用start方法
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
    }
}
