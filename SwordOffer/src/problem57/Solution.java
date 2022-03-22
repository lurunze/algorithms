package problem57;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] + nums[high] < target) {
                low++;
            } else if (nums[low] + nums[high] > target){
                high--;
            } else {
                int[] res = new int[2];
                res[0] = nums[low];
                res[1] = nums[high];
                return res;
            }
        }
        return new int[0];
    }
}
