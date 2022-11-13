package shareMemory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/1
 */
public class TestModifyThread {
    private static void startModifyThread(final List<String> list) {
        Thread modifyThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                list.add("item " + i);
                try {
                    Thread.sleep((int) (Math.random() * 10));
                } catch (InterruptedException e) {
                }
            }
        });
        modifyThread.start();
    }

    private static void startIteratorThread(final List<String> list) {
        Thread iteratorThread = new Thread(() -> {
            while (true) {
                for (String str : list) {
                }
            }
        });
        iteratorThread.start();
    }

    public static void main(String[] args) {
        final List<String> list = Collections.synchronizedList(new ArrayList<>());
        startIteratorThread(list);
        startModifyThread(list);
    }

}
