public class MinNoOfFlipToMakeGridPalindromic1 {
    public int minFlips(int[][] grid) {
        int rowPal = 0;
        for (int[] row : grid) {
            int left = 0;
            int right = row.length - 1;
            while (left <= right) {
                if (row[left] != row[right]) {
                    rowPal++;
                }
                left++;
                right--;
            }
        }

        int colPal = 0;

        for (int i = 0; i < grid[0].length; i++) {
            int top = 0;
            int bottom = grid.length - 1;
            while (top <= bottom) {
                if (grid[top][i] != grid[bottom][i]) {
                    colPal++;
                }
                top++;
                bottom--;
            }
        }
        return rowPal > colPal ? colPal : rowPal;
    }
}