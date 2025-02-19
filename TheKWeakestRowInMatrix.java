import java.util.*;

public class TheKWeakestRowInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < mat.length; i++) {
            int sol = 0;
            for (int val : mat[i]) {
                sol += val;
            }
            pq.offer(new int[] { sol, i });
        }
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}
