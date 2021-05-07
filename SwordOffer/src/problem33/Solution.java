package problem33;

public class Solution {

  public boolean verifyPostorder(int[] postorder) {
    if (postorder == null) {
      return true;
    }
    return helper(postorder, 0, postorder.length - 1);
  }

  private boolean helper(int[] postorder, int left, int right) {
    if (left >= right) {
      return true;
    }
    int i = left;
    while (postorder[i] < postorder[right]) {
      i++;
    }
    int m = i;
    while (postorder[i] > postorder[right]) {
      i++;
    }
    return i == right && helper(postorder, left, m - 1) && helper(postorder, m, right - 1);
  }
}
