package problem06;

import util.ListNode;

/**
 * by 数组
 *
 * @author lurunze
 */
public class Solution {

    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        int[] array = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            array[i] = head.val;
            head = head.next;
        }
        return array;
    }
}
