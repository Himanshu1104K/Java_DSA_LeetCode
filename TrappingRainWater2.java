import java.util.*;

public class TrappingRainWater2 {
    public static int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    pq.add(new int[] { heightMap[i][j], i, j });
                    visited[i][j] = true;
                }
            }
        }

        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int waterVolume = 0;
        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            int value = arr[0];
            int row = arr[1];
            int col = arr[2];

            for (int[] dir : directions) {
                int nrow = row + dir[0];
                int ncol = col + dir[1];

                if (nrow >= 0 && ncol >= 0 && nrow < m && ncol < n && !visited[nrow][ncol]) {
                    if (value - heightMap[nrow][ncol] > 0) {
                        waterVolume += value - heightMap[nrow][ncol];
                        pq.offer(new int[] { value, nrow, ncol });
                    } else {
                        pq.offer(new int[] { heightMap[nrow][ncol], nrow, ncol });
                    }
                    visited[nrow][ncol] = true;
                }
            }

        }

        return waterVolume;
    }

    public static void main(String[] args) {
        trapRainWater(new int[][] { { 1, 4, 3, 1, 3, 2 }, { 3, 2, 1, 3, 2, 4 }, { 2, 3, 3, 2, 3, 1 } });
    }
}
