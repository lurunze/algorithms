package problem04;

class Solution {

  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if (matrix == null) {
      return false;
    }

    int y = matrix.length;
    if (y == 0) {
      return false;
    }

    int x = matrix[0].length;

    int i = 0;
    int j = y - 1;
    while (i < x && j >= 0) {
      if (target > matrix[j][i]) {
        i++;
      } else if (target < matrix[j][i]) {
        j--;
      } else {
        return true;
      }
    }

    return false;
  }
}
