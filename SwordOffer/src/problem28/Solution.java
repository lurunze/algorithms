package problem28;

import util.TreeNode;

/**
 * 递归
 */
public class Solution {

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return helper(root.left, root.right);
  }

  private boolean helper(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null || left.val != right.val) {
      return false;
    }
    return helper(left.left, right.right) && helper(left.right, right.left);
  }
}