package problem18;

import util.ListNode;

/**
 * @author lurunze
 */
public class Solution2 {
  public ListNode deleteNode(ListNode head, int val) {
    ListNode node = new ListNode(0);
    node.next = head;
    ListNode per = node;
    ListNode cur = head;
    while (cur != null) {
      if (cur.val == val) {
        per.next = cur.next;
        return node.next;
      }
      per = cur;
      cur = cur.next;
    }
    return node.next;
  }
}
