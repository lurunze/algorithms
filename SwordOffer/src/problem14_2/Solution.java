package problem14_2;

/**
 * @author lurunze
 */
public class Solution {

  public int cuttingRope(int n) {
    if (n < 4) {
      return n - 1;
    }
    long res = 1;
    while (n > 4) {
      n = n - 3;
      res = res * 3 % 1000000007;
    }
    return (int)(res * n % 1000000007);
  }
}
