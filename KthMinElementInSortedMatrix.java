
import java.util.PriorityQueue;

public class KthMinElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        if (k == 1) {
            return matrix[0][0];
        }
        if (k == n * n) {
            return matrix[n - 1][n - 1];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.offer(matrix[i][j]);
            }
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.poll();
    }

    public static void main(String[] args) {

    }
}
