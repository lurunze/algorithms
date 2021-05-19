package problem45;

public class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        int i = 0;
        for (int num : nums) {
            strs[i++] = String.valueOf(num);
        }
        quickSort(0, nums.length - 1, strs);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strs) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    private void quickSort(int low, int high, String[] strs) {
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;
        int p = low;
        while (left < right) {
            while (left < right && (strs[p] + strs[right]).compareTo(strs[right] + strs[p]) <= 0) {
                right--;
            }
            while (left < right && (strs[p] + strs[left]).compareTo(strs[left] + strs[p]) >= 0) {
                left++;
            }
            swap(left, right, strs);
        }
        swap(left, p, strs);
        quickSort(low, left - 1, strs);
        quickSort(right + 1, high, strs);
    }

    private void swap(int x, int y, String[] strs) {
        String tmp = strs[x];
        strs[x] = strs[y];
        strs[y] = tmp;
    }
}
