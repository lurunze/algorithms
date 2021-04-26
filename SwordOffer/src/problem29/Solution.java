package problem29;

public class Solution {
  public int[] spiralOrder(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return new int[0];
    }
    int l = 0;
    int r = matrix[0].length - 1;
    int t = 0;
    int b = matrix.length - 1;
    int count = 0;
    int[] array = new int[(r + 1) * (b + 1)];
    while (true) {
      for (int i = l; i <= r; i++) {
        array[count++] = matrix[t][i];
      }
      if (++t > b) {
        break;
      }
      for (int j = t; j <= b; j++) {
        array[count++] = matrix[j][r];
      }
      if (--r < l) {
        break;
      }
      for (int i = r; i >= l; i--) {
        array[count++] = matrix[b][i];
      }
      if (--b < t) {
        break;
      }
      for (int j = b; j>= t; j--) {
        array[count++] = matrix[j][l];
      }
      if (++l > r) {
        break;
      }
    }
    return array;
  }
}
