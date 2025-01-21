public class GridGame {
    public long gridGame(int[][] grid) {
        long top = 0;
        int n = grid[0].length;
        for (int i = 0; i < n; i++) {
            top += grid[0][i];
        }
        long bottom = 0;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            top -= grid[0][i];
            ans = Math.min(ans, Math.max(bottom, top));
            bottom += grid[1][i];
        }
        return ans;
    }
}