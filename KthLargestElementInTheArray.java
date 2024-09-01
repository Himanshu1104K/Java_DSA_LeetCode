import java.util.*;

public class KthLargestElementInTheArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pq.offer(num);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.poll();
    }

    public static void main(String[] args) {

    }
}