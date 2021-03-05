package problem06;

import java.util.Arrays;
import util.ListNode;

/**
 * @author lurunze
 */
public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(2);
    node1.next = node2;
    node2.next = node3;
    System.out.println(Arrays.toString(solution.reversePrint(node1)));
  }

}
