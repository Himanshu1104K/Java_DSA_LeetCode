
import java.util.Arrays;

public class FindScoreOfArrayAfterMarkingAllElement {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] grid = new int[n][2];
        for (int i = 0; i < n; i++) {
            grid[i][0] = nums[i];
            grid[i][1] = i;
        }

        Arrays.sort(grid, (a, b) -> a[0] - b[0]);
        long score = 0;

        boolean[] track = new boolean[n];

        for (int i = 0; i < n; i++) {
            int trackIdx = grid[i][1];
            if (!track[trackIdx]) {
                score += grid[i][0];
                track[trackIdx] = true;
                if (trackIdx > 0) {
                    track[trackIdx - 1] = true;
                }
                if (trackIdx < n - 1) {
                    track[trackIdx + 1] = true;
                }
            }
        }

        return score;
    }
}