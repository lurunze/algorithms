package problem13;

/**
 * @author lurunze
 */
public class Solution {

  public int movingCount(int m, int n, int k) {
    int[][] matrix = new int[m][n];
    dfs(matrix, 0, 0, k);
    int sum = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        sum += matrix[i][j];
      }
    }
    return sum;
  }

  private void dfs(int[][] matrix, int x, int y, int k) {
    if (getSum(x) + getSum(y) > k || x < 0 || x > matrix.length - 1 || y < 0 || y > matrix[0].length - 1 || matrix[x][y] == 1) {
      return;
    }
    matrix[x][y] = 1;
    dfs(matrix, x + 1, y, k);
    dfs(matrix, x, y + 1, k);
    //不需要向上和向左
//    dfs(matrix, x - 1, y, k);
//    dfs(matrix, x, y - 1, k);
  }

  private int getSum(int x) {
    return x / 100 + x / 10 + x % 10;
  }
}
