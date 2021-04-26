package problem26;

import util.TreeNode;

/**
 * 递归
 */
public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return isSamTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSamTree(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null || a.val != b.val) {
            return false;
        }
        return isSamTree(a.left, b.left) && isSamTree(a.right, b.right);
    }
}