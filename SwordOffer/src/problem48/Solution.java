package problem48;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!window.contains(c)) {
                window.add(c);
                right++;
                max = Math.max(max, right - left);
            } else {
                max = Math.max(max, right - left);
                window.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
