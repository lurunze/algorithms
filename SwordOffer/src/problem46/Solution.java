package problem46;

public class Solution {
    public int translateNum(int num) {
        int a = 1;
        int b = 1;
        int x;
        int y = num % 10;
        while (num != 0) {
            num /= 10;
            x = num % 10;
            int tmp = x * 10 + y;
            int c;
            if (tmp >= 10 && tmp <= 25) {
                c = a + b;
            } else {
                c = a;
            }
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}
