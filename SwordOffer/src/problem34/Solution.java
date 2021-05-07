package problem34;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class Solution {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root != null) {
            List<Integer> list = new ArrayList<>();
            helper(root, target, list);
        }
        return result;
    }

    private void helper(TreeNode node, int target, List<Integer> list) {
        if (node.left == null && node.right == null && target == node.val) {
            result.add(list);
        }
        list.add(node.val);
        List<Integer> list1 = new ArrayList<>(list);
        List<Integer> list2 = new ArrayList<>(list);
        if (node.left != null) {
            helper(node.left, target - node.val, list1);
        }
        if (node.right != null) {
            helper(node.right, target - node.val, list2);
        }
    }
}
