package problem12;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
//    char[][] matrix = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    char[][] matrix = new char[][]{{'A','A'}};
    System.out.println(solution.exist(matrix, "AAA"));
  }
}
