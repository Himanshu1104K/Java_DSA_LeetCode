
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; i++) {
            pq.offer(nums[i]);
        }
        int[] result = new int[nums.length - k + 1];
        result[0] = pq.peek();
        for (int i = 1; i < nums.length - k + 1; i++) {
            pq.offer(nums[i + k - 1]);
            pq.remove(nums[i - 1]);
            result[i] = pq.peek();
        }
        return result;
    }
}
