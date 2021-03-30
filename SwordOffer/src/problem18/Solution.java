package problem18;

import util.ListNode;

/**
 * @author lurunze
 */
public class Solution {
  public ListNode deleteNode(ListNode head, int val) {
    ListNode node1 = null;
    ListNode node2 = head;
    while (node2 != null) {
      if (node2.val == val) {
        if (node1 == null) {
          return node2.next;
        }
        node1.next = node2.next;
        break;
      } else {
        node1 = node2;
        node2 = node2.next;
      }
    }
    return head;
  }
}
