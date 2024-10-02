import java.util.*;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int num : nums) {
            pq.offer(num);
        }
        for (int i = 0; i < pq.size(); i++) {
            nums[i] = pq.poll();
        }
        return nums;
    }
}
