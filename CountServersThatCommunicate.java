public class CountServersThatCommunicate {
    public static int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowS = new int[m];
        int[] colS = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowS[i]++;
                    colS[j]++;
                }

            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (rowS[i] > 1 || colS[j] > 1) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        countServers(new int[][] { { 1, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } });
    }
}