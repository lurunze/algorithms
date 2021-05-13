package problem39;

public class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            if (res == num) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }
}