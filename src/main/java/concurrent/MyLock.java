package concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class MyLock {
//    private AtomicInteger status = new AtomicInteger();
//
//    public void lock() {
//        while (!status.compareAndSet(0, 1)) {
//            Thread.yield();
//        }
//    }
//
//    public void unLock() {
//        status.compareAndSet(1, 0);
//    }

    ReentrantLock reentrantLock = new ReentrantLock();
    private volatile int num;

    public void incr() {
        reentrantLock.lock();
        try {
            num++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getNum() {
        return num;
    }

}
