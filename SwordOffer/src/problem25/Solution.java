package problem25;

import util.TreeNode;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        while (A != null) {
            if (A.val == B.val) {
                return isSamTree(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
            } else {
                return isSubStructure(A.left, B) || isSubStructure(A.right, B);
            }
        }
        return true;
    }

    boolean isSamTree(TreeNode a, TreeNode b) {
        if (a == null) {
            return false;
        }
        if (a.val == b.val) {
            boolean isSame = true;
            if (b.left != null) {
                isSame = isSame && isSamTree(a.left, b.left);
            }
            if (b.right != null) {
                isSame = isSame && isSamTree(a.right, b.right);
            }
            return isSame;
        } else {
            return false;
        }
    }
}
