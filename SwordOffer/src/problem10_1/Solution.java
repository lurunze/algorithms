package problem10_1;

import java.util.Arrays;

public class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            array[i] = array[i - 2] + array[i - 1];
            if (array[i] > 1000000007) {
                array[i] -= 1000000007;
            }
        }
        return array[n];
    }
}
