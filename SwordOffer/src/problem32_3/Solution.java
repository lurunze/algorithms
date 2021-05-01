package problem32_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import util.TreeNode;

public class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      LinkedList<Integer> list = new LinkedList<>();
      for (int i = queue.size(); i > 0; i--) {
        TreeNode node = queue.poll();
        if (node != null) {
          queue.add(node.left);
          queue.add(node.right);
          if ((result.size() & 1) == 0) {
            list.add(node.val);
          } else {
            list.addFirst(node.val);
          }
        }
      }
      if (!list.isEmpty()) {
        result.add(list);
      }
    }
    return result;
  }
}
