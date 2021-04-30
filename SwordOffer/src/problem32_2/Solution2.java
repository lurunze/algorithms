package problem32_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import util.TreeNode;

public class Solution2 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      List<Integer> list = new ArrayList<>();
      for (int i = queue.size(); i > 0; i--) {
        TreeNode node = queue.poll();
        if (node != null) {
          queue.add(node.left);
          queue.add(node.right);
          list.add(node.val);
        }
      }
      if (!list.isEmpty()) {
        result.add(list);
      }
    }
    return result;
  }
}
