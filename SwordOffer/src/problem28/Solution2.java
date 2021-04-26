package problem28;

import java.util.LinkedList;
import util.TreeNode;

/**
 * 迭代，层序遍历
 */
public class Solution2 {

  public boolean isSymmetric(TreeNode root) {
    LinkedList<TreeNode> linkedList = new LinkedList<>();
    if (root != null) {
      linkedList.offer(root.left);
      linkedList.offer(root.right);
    }
    while (!linkedList.isEmpty()) {
      LinkedList<TreeNode> tmpLinkedList = new LinkedList<>(linkedList);
      while (!linkedList.isEmpty()) {
        TreeNode left = linkedList.removeFirst();
        TreeNode right = linkedList.removeLast();
        if (left == null && right == null) {
          continue;
        }
        if (left == null || right == null || left.val != right.val) {
          return false;
        }
      }
      while (!tmpLinkedList.isEmpty()) {
        TreeNode node = tmpLinkedList.poll();
        if (node != null) {
          linkedList.offer(node.left);
          linkedList.offer(node.right);
        }
      }
    }
    return true;
  }
}
