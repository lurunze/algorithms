package problem27;

import java.util.LinkedList;
import java.util.Queue;
import util.TreeNode;

/**
 * 迭代
 */
public class Solution {
  public TreeNode mirrorTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.offer(root);
    }
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      TreeNode temp = node.left;
      node.left = node.right;
      node.right = temp;
      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
    }
    return root;
  }
}