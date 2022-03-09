package problem53_1;

public class Solution2 {
    public int search(int[] nums, int target) {

        return helper(nums, target) - helper(nums, target - 1);
    }

    int helper(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}
