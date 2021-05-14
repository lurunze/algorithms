package problem40;

import java.util.Arrays;

/**
 * 基于快速排序的数组划分
 */
public class Solution3 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(0, arr.length - 1, k, arr);
        return Arrays.copyOf(arr, k);
    }

    void quickSort(int low, int high, int k, int[]arr) {
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;
        while (left < right) {
            while (left < right && arr[right] >= arr[low]) {
                right--;
            }
            while (left < right && arr[left] <= arr[low]) {
                left++;
            }
            swap(left, right, arr);
        }
        swap(low, left, arr);
        if (left < k) {
            quickSort(left + 1, high, k, arr);
        } else if (left > k) {
            quickSort(low, left - 1, k, arr);
        }
    }

    void swap(int x, int y, int[]arr) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
