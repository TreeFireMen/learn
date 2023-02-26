package Leetcode.reverseList;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-10
 */
public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        l2.next = l1;
        detectCycle(l1);
//        ListNode res = reverseList(l1);
//        ListNode res = middleNode(l1);

    }

    static int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            cost = Math.min(cost, prices[i]);
            profit = Math.max(profit, prices[i] - cost);
        }
        return profit;
    }
    static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == null || slow.next == null
                    || fast == null || fast.next == null) {
                // 不成环
                return null;
            }
        }
        return slow.next;
    }

    static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//           ListNode next = cur.next;
//           cur.next = pre;
////           next.next = cur;
//            pre = cur;
//           cur = next;
//        }
//        return pre;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
