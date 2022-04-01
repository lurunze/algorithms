package problem13;

public class Solution2 {
    int count = 0;

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        helper(visited, 0, 0, k);
        return count;
    }

    private void helper(boolean[][] visited, int i, int j, int k) {
        if (i == visited.length || j == visited[0].length || visited[i][j] || sum(i) + sum(j) > k) {
            return;
        }
        visited[i][j] = true;
        count++;
        helper(visited, i + 1, j, k);
        helper(visited, i, j + 1, k);
    }

    private int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}