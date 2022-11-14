package concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class MyCount {
    private volatile int count;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i1 = atomicInteger.get();
        System.out.println(i1);
        int i = atomicInteger.addAndGet(2);
        int andIncrement = atomicInteger.getAndIncrement();
        System.out.println(i);
    }

    public synchronized void add() {
        count++;
    }

    public synchronized int get() {
        return count;
    }
}
