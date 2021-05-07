package problem34;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        helper(root, target);
        return result;
    }

    void helper(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            result.add(new ArrayList<>(path));
        }
        helper(root.left, target);
        helper(root.right, target);
        path.remove(path.size() - 1);
    }
}
