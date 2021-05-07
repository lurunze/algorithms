package problem35;

import util.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 */
public class Solution {
    public Node copyRandomList(Node head) {
        Node per = new Node(0);
        Node perCopy = per;
        Node headCopy = head;

        Map<Node, Node> nodeMap = new HashMap<>(16);
        while (headCopy != null) {
            Node node = new Node(headCopy.val);
            nodeMap.put(headCopy, node);
            perCopy.next = node;
            perCopy = node;
            headCopy = headCopy.next;
        }
        headCopy = head;
        perCopy = per.next;
        while (headCopy != null) {
           Node random = headCopy.random;
           perCopy.random = nodeMap.get(random);
           headCopy = headCopy.next;
           perCopy = perCopy.next;
        }
        return per.next;
    }
}
