package problem17;

/**
 * @author lurunze
 */
public class Solution {
  int[] res;
  int count = 0;
  public int[] printNumbers(int n) {
    res = new int[(int) Math.pow(10, n) - 1];
    for (int dict = 1; dict <= n; dict++) {
      for (char first = '1'; first <= '9'; first++) {
        char[] num = new char[dict];
        num[0] = first;
        dfs(1, dict, num);
      }
    }
    return res;
  }

  void dfs(int index, int dict, char[]num) {
    if (index == dict) {
      res[count++] = Integer.parseInt(String.valueOf(num));
      return;
    }
    for (char c = '0'; c <= '9'; c++) {
      num[index] = c;
      dfs(index + 1, dict, num);
    }
  }
}
