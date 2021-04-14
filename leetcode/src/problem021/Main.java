package problem021;

import util.ListNode;

public class Main {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(4);
    node1.next = node2;
    node2.next = node3;

    ListNode node11 = new ListNode(1);
    ListNode node12 = new ListNode(3);
    ListNode node13 = new ListNode(4);
    node11.next = node12;
    node12.next = node13;

    Solution solution = new Solution();
    ListNode node = solution.mergeTwoLists(node1, node11);
    System.out.println(node);
  }

}
