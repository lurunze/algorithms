package problem61;

import java.util.Arrays;

public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        int pre = 0;
        for (int num : nums) {
            if (num == 0) {
                joker++;
            } else if (pre == num) {
                return false;
            }
            pre = num;
        }
        return nums[4] - nums[joker] < 5;
    }
}
