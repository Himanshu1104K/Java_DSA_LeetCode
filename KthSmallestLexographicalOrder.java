import java.util.*;

public class KthSmallestLexographicalOrder {
    public int findKthNumber(int n, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));

        for (int i = 1; i <= n; i++) {
            pq.offer(Integer.toString(i));
        }

        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        return Integer.parseInt(pq.poll());
    }
}