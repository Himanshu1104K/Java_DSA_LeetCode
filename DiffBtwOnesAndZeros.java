public class DiffBtwOnesAndZeros {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int onesR[] = new int[m];
        int onesC[] = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                onesR[i] += grid[i][j];
                onesC[j] += grid[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 2 * onesR[i] + 2 * onesC[j] - m - n;
            }
        }

        return grid;
    }
}
