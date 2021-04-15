package problem101;

import java.util.LinkedList;
import util.TreeNode;

public class Solution2 {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    LinkedList<TreeNode> linkedList = new LinkedList<>();
    linkedList.add(root.left);
    linkedList.add(root.right);
    while (!linkedList.isEmpty()) {
      TreeNode left = linkedList.removeFirst();
      TreeNode right = linkedList.removeFirst();
      if (left == null && right == null) {
        continue;
      }
      if (left == null || right == null) {
        return false;
      }
      if (left.val != right.val) {
        return false;
      }
      linkedList.add(left.left);
      linkedList.add(right.right);
      linkedList.add(left.right);
      linkedList.add(right.left);
    }
    return true;
  }
}
