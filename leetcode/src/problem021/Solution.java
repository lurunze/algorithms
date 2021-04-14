package problem021;

import util.ListNode;

/**
 * 迭代
 *
 * @author lurunze
 */
public class Solution {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode();
    ListNode node = head;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        node.next = l1;
        l1 = l1.next;
      } else {
        node.next = l2;
        l2 = l2.next;
      }
      node = node.next;
    }
    node.next = l1 == null ? l2 : l1;
    return head.next;
  }
}
