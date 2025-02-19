import java.util.*;

public class DeleteGreatestElementFromEachRow {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        for (int[] row : grid) {
            Arrays.sort(row);
        }
        int sum = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(grid[i][j], max);
            }
            sum += max;
        }
        return sum;
    }
}