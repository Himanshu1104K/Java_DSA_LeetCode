import java.util.*;

public class FinalArrayAfterKMulOperation1 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }

        for (int i = 0; i < k; i++) {
            int x = pq.poll();
            pq.offer(x * multiplier);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = pq.poll();
        }

        return nums;
    }
}
