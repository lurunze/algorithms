package problem32_2;

import java.util.Arrays;
import util.TreeNode;
import util.TreeUtil;

public class Main {

  public static void main(String[] args) {
    Integer[] array = {3,9,20,null,null,15,7};
    TreeNode root = TreeUtil.ListToTree(Arrays.asList(array));
    Solution solution = new Solution();
    solution.levelOrder(root);
  }

}
