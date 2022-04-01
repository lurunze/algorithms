package problem54;

import util.TreeNode;

public class Solution {
    int res;
    int index;
    public int kthLargest(TreeNode root, int k) {
        helper(root, k);
        return res;
    }

    private void helper(TreeNode root, int k) {
        if (root == null || index >= k) {
            return;
        }
        helper(root.right, k);
        if (k == ++index) {
            res = root.val;
            return;
        }
        helper(root.left, k);
    }
}
