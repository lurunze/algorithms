package problem58_1;

public class Solution {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;
        while (i >= 0) {
            int index = i;
            while (index >= 0 && s.charAt(index) == ' ') {
                index--;
            }
            if (index < 0) {
                break;
            }

            i = index;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (i < 0) {
                sb.append(s, 0, index + 1).append(' ');
            } else {
                sb.append(s, i + 1, index + 1).append(' ');
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
