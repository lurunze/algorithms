package problem28;

import java.util.LinkedList;
import util.TreeNode;

/**
 * 迭代，先序遍历
 */
public class Solution3 {
  public boolean isSymmetric (TreeNode root) {
    if (root == null) {
      return true;
    }
    LinkedList<TreeNode> lQueue = new LinkedList<>();
    LinkedList<TreeNode> rQueue = new LinkedList<>();
    lQueue.offer(root.left);
    rQueue.offer(root.right);
    while (!lQueue.isEmpty()) {
      TreeNode lNode = lQueue.removeLast();
      TreeNode rNode = rQueue.removeLast();
      if (lNode == null && rNode == null) {
        continue;
      }
      if (lNode == null || rNode == null || lNode.val != rNode.val) {
        return false;
      }
      lQueue.offer(lNode.left);
      lQueue.offer(lNode.right);
      rQueue.offer(rNode.right);
      rQueue.offer(rNode.left);
    }
    return true;
  }
}