package problem18;

import util.ListNode;

/**
 * @author lurunze
 */
public class Main {

  public static void main(String[] args) {
    ListNode head = new ListNode(4);
    head.next = new ListNode(5);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(9);
//    Solution solution = new Solution();
//    ListNode node = solution.deleteNode(head, 5);
    Solution2 solution2 = new Solution2();
    ListNode node2 = solution2.deleteNode(head, 5);
    System.out.println();
  }

}
