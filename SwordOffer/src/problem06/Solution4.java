package problem06;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归
 *
 * @author lurunze
 */
public class Solution4 {
    List<Integer> list = new ArrayList<>();

    public int[] reversePrint(ListNode head) {
        reserve(head);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void reserve(ListNode head) {
        if (head == null) {
            return;
        }
        reserve(head.next);
        list.add(head.val);
    }
}
