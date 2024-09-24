import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int num : nums) {
            if (!pq.contains(num)) {
                pq.offer(num);
            }
        }
        if (pq.size() < 3) {
            return pq.poll();
        }
        pq.poll();
        pq.poll();
        return pq.poll();
    }
}
