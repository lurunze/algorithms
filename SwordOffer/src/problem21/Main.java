package problem21;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] array = new int[] {2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
    Solution solution = new Solution();
    System.out.println(Arrays.toString(solution.exchange(array)));
  }
}
