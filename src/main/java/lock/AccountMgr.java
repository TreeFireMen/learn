package lock;

import java.util.Random;
import java.util.concurrent.locks.LockSupport;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/2
 */
public class AccountMgr {

    public static boolean transfer(Account from, Account to, double money) throws NoEnoughMoneyException {
        if (from.tryLock()) {
            try {
                if (to.tryLock()) {
                    try {
                        if (from.getMoney() >= money) {
                            from.reduce(money);
                            to.add(money);
                        } else {
                            throw new NoEnoughMoneyException();
                        }
                        return true;
                    } finally {
                        to.unlock();
                    }
                }
            } finally {
                from.unlock();
            }
        }
        return false;

    }

    public static void simulateDeadLock() {
        final int accountNum = 10;
        final Account[] accounts = new Account[accountNum];
        final Random rnd = new Random();
        for (int i = 0; i < accountNum; i++) {
            accounts[i] = new Account(rnd.nextInt(10000));
        }
        int threadNum = 100;
        Thread[] threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            threads[i] = new Thread(() -> {
                int loopNum = 100;
                for (int k = 0; k < loopNum; k++) {
                    int i1 = rnd.nextInt(accountNum);
                    int j = rnd.nextInt(accountNum);
                    int money = rnd.nextInt(10);
                    if (i1 != j) {
                        try {
                            transfer(accounts[i1], accounts[j], money);
                        } catch (NoEnoughMoneyException e) {
                        }
                    }
                }
            });
            threads[i].start();
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        simulateDeadLock();
        Thread t = new Thread() {
            public void run() {
                LockSupport.park();
                System.out.println("exit");
            }
        };
        t.start();
        Thread.sleep(1000);
        LockSupport.unpark(t);
    }

    public static class NoEnoughMoneyException extends Exception {
    }

}
