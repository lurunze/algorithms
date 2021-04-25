package problem21;

public class Solution {

  public int[] exchange(int[] nums) {
    if (nums == null) {
      return null;
    }
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      if ((nums[left] & 1) == 1) {
        left++;
        continue;
      }
      if ((nums[right] & 1) == 0) {
        right--;
        continue;
      }
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
    return nums;
  }
}