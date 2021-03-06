package problem07;

import util.TreeNode;

/**
 * @author lurunze
 */
public class Solution {

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || preorder.length == 0) {
      return null;
    }
    if (preorder.length == 1) {
      return new TreeNode(preorder[0]);
    }

    int index = 0;
    for (int i = 0; i < inorder.length; i++) {
      if (inorder[i] == preorder[0]) {
        index = i;
      }
    }

    int[] leftInorder = new int[index];
    int[] rightInorder = new int[inorder.length - index - 1];
    for (int i = 0, j = 0; i < inorder.length; i++) {
      if (i < index) {
        leftInorder[i] = inorder[i];
      } else if (i > index) {
        rightInorder[j++] = inorder[i];
      }
    }

    int[] leftPreorder = new int[leftInorder.length];
    int[] rightPreorder = new int[rightInorder.length];
    for (int i = 1, j = 0; i < preorder.length; i++) {
      if (i <= leftInorder.length) {
        leftPreorder[i - 1] = preorder[i];
      } else {
        rightPreorder[j++] = preorder[i];
      }
    }

    TreeNode root = new TreeNode(preorder[0]);
    root.left = buildTree(leftPreorder, leftInorder);
    root.right = buildTree(rightPreorder, rightInorder);
    return root;
  }

}
