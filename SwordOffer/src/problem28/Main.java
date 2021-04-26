package problem28;

import java.util.Arrays;
import util.TreeNode;
import util.TreeUtil;

public class Main {

  public static void main(String[] args) {
    Integer[] array = {2,3,3,4,5,5,4,null,null,8,9,9,8};
    TreeNode root = TreeUtil.ListToTree(Arrays.asList(array));
    Solution2 solution2 = new Solution2();
    System.out.println(solution2.isSymmetric(root));
  }

}
