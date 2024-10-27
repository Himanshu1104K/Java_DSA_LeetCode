public class CountSqSubMatAllOnes {
    public int countSquares(int[][] matrix) {
        int ans = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 1 + Math.min(Math.min(matrix[i - 1][j], matrix[i - 1][j - 1]), matrix[i][j - 1]);
                }
            }
        }

        for (var row : matrix) {
            for (int val : row) {
                ans += val;
            }
        }

        return ans;
    }
}