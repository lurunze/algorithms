package problem52;

import util.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode node = new ListNode(3);
        headA.next = node;
        Solution solution = new Solution();
        ListNode res = solution.getIntersectionNode(headA, null);
        System.out.println(res);
    }
}
