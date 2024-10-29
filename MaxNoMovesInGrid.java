
public class MaxNoMovesInGrid {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int moves = 0;

        for (int i = 0; i < m; i++) {
            int y = i;
            int x = 0;
            int curMove = 0;

            while (x + 1 < n) {
                boolean moved = false;
                if (y > 0 && grid[y - 1][x + 1] > grid[y][x]) {
                    y--;
                    curMove++;
                    moved = true;
                } else if (y + 1 < m && grid[y + 1][x + 1] > grid[y][x]) {
                    y++;
                    curMove++;
                    moved = true;
                } else if (grid[y][x + 1] > grid[y][x]) {
                    curMove++;
                    moved = true;
                }

                if (!moved)
                    break;
                x++;
            }

            moves = Math.max(curMove, moves);
        }

        return moves;
    }
}