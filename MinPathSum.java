
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        return findPath(grid, m - 1, n - 1, dp);
    }

    public int findPath(int[][] grid, int m, int n, int[][] dp) {
        if (m == 0 && n == 0) {
            return grid[m][n];
        } else if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        } else if (dp[m][n] != 0) {
            return dp[m][n];
        }
        return dp[m][n] = grid[m][n] + Math.min(findPath(grid, m - 1, n, dp), findPath(grid, m, n - 1, dp));
    }
}
