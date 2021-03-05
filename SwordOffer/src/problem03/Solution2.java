package problem03;

/**
 * @author lurunze
 */
public class Solution2 {

  public int findRepeatNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (num == i) {
        continue;
      }

      int num2 = nums[num];
      if (num2 == num) {
        return num;
      }

      nums[i] = num2;
      nums[num] = num;
    }
    return -1;
  }

}
