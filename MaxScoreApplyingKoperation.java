
import java.util.*;

public class MaxScoreApplyingKoperation {

    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pq.offer(num);
        }
        long result = 0;
        for (int i = 1; i <= k; i++) {
            int num = pq.poll();
            result += num;
            pq.offer((int) Math.ceilDiv(num, 3));
        }
        return result;
    }
}
