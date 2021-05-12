package problem38;

import java.util.*;

public class Solution {
    List<String> res = new ArrayList<>();
    char[] chars;
    public String[] permutation(String s) {
        if (s == null || s.isEmpty()) {
            return new String[]{};
        }
        chars = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int index) {
        if (index == chars.length - 1) {
            res.add(String.valueOf(chars));
            return;
        }
        Set<Character> characterSet = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (characterSet.contains(chars[i])) {
                continue;
            }
            characterSet.add(chars[i]);
            swap(i, index);
            dfs(index + 1);
            swap(i, index);
        }
    }

    private void swap(int x, int y) {
        char tmp = chars[x];
        chars[x] = chars[y];
        chars[y] = tmp;
    }
}