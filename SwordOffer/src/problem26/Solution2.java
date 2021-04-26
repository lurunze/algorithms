package problem26;

import java.util.LinkedList;
import java.util.Queue;
import util.TreeNode;

/**
 * 迭代
 */
public class Solution2 {
  public boolean isSubStructure(TreeNode A, TreeNode B) {
    if (B == null) {
      return false;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    if (A != null) {
      queue.offer(A);
    }
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.val == B.val && isSame(node, B)) {
       return true;
      }
      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
    }
    return false;
  }

  private boolean isSame(TreeNode a, TreeNode b) {
    Queue<TreeNode> queueA = new LinkedList<>();
    Queue<TreeNode> queueB = new LinkedList<>();
    queueA.offer(a);
    queueB.offer(b);
    while (!queueB.isEmpty()) {
      TreeNode nodeA = queueA.poll();
      TreeNode nodeB = queueB.poll();
      if (nodeA == null || nodeA.val != nodeB.val) {
        return false;
      }
      if (nodeB.left != null) {
        queueB.offer(nodeB.left);
        queueA.offer(nodeA.left);
      }
      if (nodeB.right != null) {
        queueB.offer(nodeB.right);
        queueA.offer(nodeA.right);
      }
    }
    return true;
  }
}