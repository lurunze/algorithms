package problem06;

import util.ListNode;

import java.util.Stack;

/**
 * 辅助栈
 *
 * @author lurunze
 */
public class Solution3 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            result[i++] = stack.pop();
        }
        return result;
    }
}
