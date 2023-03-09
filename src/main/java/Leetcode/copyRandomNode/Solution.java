package Leetcode.copyRandomNode;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-27
 */
public class Solution {
//
//    Map<Node, Node> cacheNode = new HashMap<>();
//    public Node copyRandomList(Node head) {
//        if (head == null) {
//            return null;
//        }
//        if (!cacheNode.containsKey(head)) {
//            Node headNew = new Node(head.val);
//            cacheNode.put(head, headNew);
//            headNew.next = copyRandomList(head.next);
//            headNew.random = copyRandomList(head.random);
//        }
//        return cacheNode.get(head);
//    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // 第一步 在A-B-C之间生成A-A'-B-B'-C
        // 注意遍历的条件是node.next.next，将生成的A' B'跳过了
        for (Node node = head; node != null; node = node.next.next) {
            Node nodeNew = new Node(node.val);
            // 下面两行代码顺序不能变
            nodeNew.next = node.next;
            node.next = nodeNew;
        }
        for (Node node = head; node != null; node = node.next.next) {
            Node nodeNew = node.next;
            // 为什么赋值的是node.random.next而不是node.random ？？
            // 因为node.random是之前的A-B-C的节点，现在需要使用新的A'-B'-C'，所以是node.random.next
            nodeNew.random = (node.random != null) ? node.random.next : null;
        }
        // 返回的结果是 A'
        Node headNew = head.next;
        for (Node node = head; node != null; node = node.next) {
            Node nodeNew = node.next;
            node.next = node.next.next;
            nodeNew.next = nodeNew.next != null ? nodeNew.next.next : null;
        }
        return headNew;
    }
}
