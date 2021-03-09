package problem12;

/**
 * @author lurunze
 */
public class Solution {

  public boolean exist(char[][] board, String word) {
    if (board == null || word == null) {
      return false;
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == word.charAt(0)) {
          if (dfs(board, word, i, j, 0)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  boolean dfs(char[][] board, String word, int x, int y, int k) {
    if (x > board.length - 1 || x < 0 || y > board[0].length - 1 || y < 0 || word.charAt(k) != board[x][y]) {
      return false;
    }
    if (k == word.length() - 1) {
      return true;
    }
    board[x][y] = '\0';
    boolean result = dfs(board, word, x + 1, y, k + 1) || dfs(board, word, x, y + 1, k + 1)
        || dfs(board, word, x - 1, y, k + 1) || dfs(board, word, x, y - 1, k + 1);
    board[x][y] = word.charAt(k);
    return result;
  }
}
