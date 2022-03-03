package problem06;

import util.ListNode;

/**
 * 链表倒序
 *
 * @author lurunze
 */
class Solution2 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        int count = 1;
        ListNode p = head.next;
        head.next = null;
        while (p != null) {
            ListNode q = p.next;
            p.next = head;
            head = p;
            p = q;
            count++;
        }
        int[] result = new int[count];
        int i = 0;
        while (head != null) {
            result[i++] = head.val;
            head = head.next;
        }
        return result;
    }
}
