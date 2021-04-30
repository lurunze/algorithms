package problem31;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
//    int[] array1 = {2,1,0};
//    int[] array2 = {1,2,0};
    int[] array1 = {1,2,3,4,5};
//    int[] array2 = {4,5,3,2,1};
    int[] array2 = {4,3,5,1,2};
    System.out.println(solution.validateStackSequences(array1, array2));
  }

}
