import java.util.*;

public class MaxNumOfFishInGrid {
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    int count = 0;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[] { i, j });
                    while (!q.isEmpty()) {
                        int cell[] = q.poll();
                        int x = cell[0];
                        int y = cell[1];
                        count += grid[x][y];
                        grid[x][y] = 0;

                        if (x > 0 && grid[x - 1][y] > 0) {
                            q.offer(new int[] { x - 1, y });
                        }
                        if (y > 0 && grid[x][y - 1] > 0) {
                            q.offer(new int[] { x, y - 1 });
                        }
                        if (x < m - 1 && grid[x + 1][y] > 0) {
                            q.offer(new int[] { x + 1, y });
                        }
                        if (y < n - 1 && grid[x][y + 1] > 0) {
                            q.offer(new int[] { x, y + 1 });
                        }
                    }
                    max = Math.max(count, max);
                }
            }
        }

        return max;
    }
}