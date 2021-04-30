package problem32_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import util.TreeNode;

public class Solution {
  public int[] levelOrder(TreeNode root) {
    LinkedList<TreeNode> linkedList = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    if (root != null) {
      linkedList.add(root);
    }
    while (!linkedList.isEmpty()) {
      TreeNode node = linkedList.poll();
      if (node != null) {
        list.add(node.val);
        linkedList.add(node.left);
        linkedList.add(node.right);
      }
    }
    int[] res = new int[list.size()];
    int i = 0;
    for (Integer num : list) {
      res[i++] = num;
    }
    return res;
  }
}
