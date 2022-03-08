package problem35;

import util.Node;

public class Solution3 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        Node newHead = head.next;
        Node pre = new Node(0);
        cur = head;
        while (cur != null) {
            pre.next = cur.next;
            cur.next = pre.next.next;
            cur = cur.next;
            pre = pre.next;
        }
        return newHead;
    }
}
