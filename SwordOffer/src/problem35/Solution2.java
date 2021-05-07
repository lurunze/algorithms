package problem35;

import util.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表(简洁版)
 */
public class Solution2 {
    public Node copyRandomList(Node head) {
        Node cur = head;
        Map<Node, Node> nodeMap = new HashMap<>(16);
        while (cur != null) {
            nodeMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            Node node = nodeMap.get(cur);
            node.next = nodeMap.get(cur.next);
            node.random = nodeMap.get(cur.random);
            cur = cur.next;
        }
        return nodeMap.get(head);
    }
}
