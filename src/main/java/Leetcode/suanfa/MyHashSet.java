package Leetcode.suanfa;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-19
 */
public class MyHashSet {
    public MyHashSet() {

    }
    boolean[] b = new boolean[1000006];

    public void add(int key) {
        b[key] = true;
    }

    public void remove(int key) {
        b[key] = false;
    }

    public boolean contains(int key) {
        return b[key];
    }


}
