package Leetcode.reverseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-23
 */
public class Reverse {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        while (head != null ) {
            deque.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[deque.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = deque.getLast();
            deque.removeLast();
        }
        return res;

    }
}
