package problem03;

public class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int[] arrays = new int[nums.length];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = -1;
        }

        for (int num : nums) {
            if (arrays[num] == -1) {
                arrays[num] = num;
            } else {
                return num;
            }
        }
        return -1;
    }
}
