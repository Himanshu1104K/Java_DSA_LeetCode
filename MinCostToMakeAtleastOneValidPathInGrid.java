import java.util.*;

public class MinCostToMakeAtleastOneValidPathInGrid {
    int[] dx = { 0, 0, 1, -1 };
    int[] dy = { 1, -1, 0, 0 };

    public int minCost(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int dist[][] = new int[r][c];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Deque<int[]> dq = new ArrayDeque<>();
        dq.offerFirst(new int[] { 0, 0 });
        dist[0][0] = 0;

        while (!dq.isEmpty()) {
            int[] cell = dq.pollFirst();
            int x = cell[0], y = cell[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];

                if (nx >= 0 && nx < r && ny >= 0 && ny < c) {
                    int cost = (i + 1 == grid[x][y]) ? 0 : 1;
                    if (dist[x][y] + cost < dist[nx][ny]) {
                        dist[nx][ny] = dist[x][y] + cost;
                        if (cost == 0) {
                            dq.offerFirst(new int[] { nx, ny });
                        } else {
                            dq.offerLast(new int[] { nx, ny });
                        }
                    }
                }
            }
        }

        return dist[r - 1][c - 1];
    }
}