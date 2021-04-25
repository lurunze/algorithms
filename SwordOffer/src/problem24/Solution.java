package problem24;

import util.ListNode;

/**
 * 迭代
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode before = null;
        while (head != null) {
            ListNode after = head.next;
            head.next = before;
            before = head;
            head = after;
        }
        return before;
    }
}
