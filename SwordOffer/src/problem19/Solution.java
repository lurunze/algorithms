package problem19;

/**
 * @author lurunze
 */
public class Solution {

  public boolean isMatch(String s, String p) {
    int m = s.length();
    int n = p.length();
    boolean[][] result = new boolean[m+1][n+1];
    result[0][0] = true;
    for (int i = 0; i < m + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        if (p.charAt(j - 1) == '*') {
          result[i][j] = result[i][j - 2];
          if (isMatch(i - 1, j - 2, s, p)) {
            result[i][j] = result[i - 1][j] || result[i][j - 2];
          }
        } else {
          if (isMatch(i - 1, j - 1, s, p)) {
            result[i][j] = result[i - 1][j - 1];
          }
        }
      }
    }
    return result[m][n];
  }

  private boolean isMatch(int i, int j, String s, String p) {
    if (i == -1) {
      return false;
    }
    if (p.charAt(j) == '.') {
      return true;
    }
    return s.charAt(i) == p.charAt(j);
  }
}
