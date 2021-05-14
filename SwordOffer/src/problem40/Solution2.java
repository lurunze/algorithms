package problem40;

import java.util.Arrays;

/**
 * 快排
 */
public class Solution2 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(0, arr.length - 1, arr);
       return Arrays.copyOf(arr, k);
    }

    void quickSort(int low, int high, int[] arr) {
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
            swap(arr, left, right);
        }
        swap(arr, low, left);
        quickSort(low, left - 1, arr);
        quickSort(left + 1, high, arr);
    }

    void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
