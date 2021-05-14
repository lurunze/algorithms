package problem42;

public class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int num : nums) {
            if (pre <= 0) {
                pre = num;
            } else {
                pre += num;
            }
            max = pre > max ? pre : max;
        }
        return max;
    }
}
