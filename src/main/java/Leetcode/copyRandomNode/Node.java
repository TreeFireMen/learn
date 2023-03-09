package Leetcode.copyRandomNode;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-27
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
