package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class Account {
    private final Lock lock = new ReentrantLock();

    private volatile double money;

    public Account(double initMoney) {
        this.money = initMoney;
    }

    public void add(double money) {
        try {
            lock.lock();
            this.money += money;
        } finally {
            lock.unlock();
        }
    }

    public void reduce(double money) {
        try {
            lock.lock();
            if (this.money >= money) {
                this.money -= money;
            } else {
                System.out.println("money is not enough");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getMoney() {
        return money;
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }

    boolean tryLock() {
        return lock.tryLock();
    }
}
