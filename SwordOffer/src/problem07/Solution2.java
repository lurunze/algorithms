package problem07;

import java.util.HashMap;
import java.util.Map;
import util.TreeNode;

public class Solution2 {

  private final Map<Integer, Integer> indexMap = new HashMap<>(16);

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null) {
      return null;
    }
    for (int i = 0; i < inorder.length; i++) {
      indexMap.put(inorder[i], i);
    }
    return myBuildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
  }

  private TreeNode myBuildTree(int[] preorder, int[] inorder, int preorderStartIndex, int preorderEndIndex, int inorderStartIndex, int inorderEndIndex) {
    if (preorderStartIndex > preorderEndIndex) {
      return null;
    }

    int inorderRootIndex = indexMap.get(preorder[preorderStartIndex]);
    TreeNode root = new TreeNode(preorder[preorderStartIndex]);
    root.left = myBuildTree(preorder, inorder, preorderStartIndex + 1, preorderStartIndex + inorderRootIndex - inorderStartIndex, inorderStartIndex, inorderRootIndex - 1);
    root.right = myBuildTree(preorder, inorder, preorderStartIndex + inorderRootIndex - inorderStartIndex + 1, preorderEndIndex, inorderRootIndex + 1, inorderEndIndex);
    return root;
  }
}
