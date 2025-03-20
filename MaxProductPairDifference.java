import java.util.*;

public class MaxProductPairDifference {
    public int maxProductDifference(int[] nums) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            min.offer(num);
            max.offer(num);
        }

        return (max.poll() * max.poll()) - (min.poll() * min.poll());
    }
}