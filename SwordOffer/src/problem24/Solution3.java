package problem24;

import util.ListNode;

import java.util.Stack;

/**
 * 辅助栈
 *
 * @author lurunze
 */
public class Solution3 {
    Stack<Integer> stack = new Stack<>();

    public ListNode reverseList(ListNode head) {
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            p.next = node;
            p = node;
        }
        return result.next;
    }
}
