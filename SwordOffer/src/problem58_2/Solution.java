package problem58_2;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() <= n) {
            return s;
        }

        String s1 = s.substring(0, n);
        String s2 = s.substring(n);
        return s2 + s1;
    }
}
