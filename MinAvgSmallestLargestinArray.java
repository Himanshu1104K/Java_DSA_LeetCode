import java.util.*;

public class MinAvgSmallestLargestinArray {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        PriorityQueue<Double> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            Double out = (double) (nums[i] + nums[n - i - 1]) / 2;
            pq.offer(out);
        }
        return pq.poll();
    }
}