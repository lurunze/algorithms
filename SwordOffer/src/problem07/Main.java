package problem07;

public class Main {

  public static void main(String[] args) {
//    int[] preorder = {3,9,20,15,7};
//    int[] inorder = {9,3,15,20,7};
//    Solution solution = new Solution();
//    solution.buildTree(preorder, inorder);
    int[] preorder = {1,2,3};
    int[] inorder = {2,3,1};
    Solution2 solution2 = new Solution2();
    solution2.buildTree(preorder, inorder);
    System.out.println();
  }

}
