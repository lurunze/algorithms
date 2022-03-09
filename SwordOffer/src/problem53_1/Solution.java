package problem53_1;

public class Solution {
    public int search(int[] nums, int target) {
        //查找右边界
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
        int right = i;

        //不包含target元素，提前结束
        if (j >= 0 && nums[j] != target) {
            return 0;
        }

        //查找左边界
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        int left = j;
        return right - left - 1;
    }
}
