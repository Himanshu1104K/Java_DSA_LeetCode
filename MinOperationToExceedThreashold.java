import java.util.*;

public class MinOperationToExceedThreashold {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long) num);
        }

        int count = 0;

        while (pq.size() > 1 && pq.peek() < k) {
            long x = pq.poll();
            long y = pq.poll();

            long result = x * 2 + y;
            pq.offer(result);
            count++;
        }

        return count;
    }
}