import java.util.*;

public class MinOperationToHalfTheSum {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

        double sum = 0;
        for (double num : nums) {
            sum += num;
            pq.offer(num);
        }

        double curSum = sum;
        sum /= 2;
        int count = 0;
        while (curSum > sum) {
            double x = (pq.poll() / 2);
            curSum -= x;
            pq.offer(x);
            count++;
        }

        return count;
    }
}
