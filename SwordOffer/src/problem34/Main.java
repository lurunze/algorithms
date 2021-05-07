package problem34;

import java.util.Arrays;

import util.TreeNode;
import util.TreeUtil;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode root = TreeUtil.ListToTree(Arrays.asList(array));
        Solution solution = new Solution();
        System.out.println(solution.pathSum(root, 22));
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.pathSum(root, 22));
    }
}
