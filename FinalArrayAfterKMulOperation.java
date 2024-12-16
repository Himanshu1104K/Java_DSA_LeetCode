import java.util.*;
public class FinalArrayAfterKMulOperation {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] != b[0]) ? a[0] - b[0] : a[1] - b[1]);
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[] { nums[i], i });
        }

        for (int i = 0; i < k; i++) {
            int[] val = pq.poll();
            int idx = val[1];
            val[0] *= multiplier;
            pq.offer(new int[] { val[0], idx });
        }

        while (!pq.isEmpty()) {
            int[] val = pq.poll();
            nums[val[1]] = val[0];
        }

        return nums;
    }
}