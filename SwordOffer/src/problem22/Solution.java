package problem22;

import util.ListNode;

public class Solution {

  public ListNode getKthFromEnd(ListNode head, int k) {
    ListNode node = head;
    for (int i = 0; i < k; i++) {
      if (head == null) {
        return null;
      }
      head = head.next;
    }
    while (head != null) {
      head = head.next;
      node = node.next;
    }
    return node;
  }
}