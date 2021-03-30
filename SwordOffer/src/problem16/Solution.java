package problem16;

/**
 * @author lurunze
 */
public class Solution {

  public double myPow(double x, int n) {
    if (x == 0) {
      return 1;
    }

    long b = n;
    if (n < 0) {
      b = -b;
      x = 1 / x;
    }
    double result = 1;

    while (b > 0) {
      if ((b & 1) == 1) {
        result *= x;
      }
      x *= x;
      b >>= 1;
    }

    return result;
  }
}
