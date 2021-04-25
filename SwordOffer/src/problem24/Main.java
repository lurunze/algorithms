package problem24;

import util.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        Solution solution = new Solution();
//        solution.reverseList(node1);
        Solution2 solution2 = new Solution2();
        ListNode result = solution2.reverseList(node1);
        System.out.println(result);
    }
}
