import java.util.*;

public class MinNumberGame {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int num : nums) {
            pq.offer(num);
        }
        int[] arr = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            int alice = pq.poll();
            int bob = pq.poll();
            arr[i++] = bob;
            arr[i++] = alice;
        }
        return arr;
    }
}
