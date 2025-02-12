import java.util.*;

public class MaxSumOfPairWithEqualSum {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int dSum = digitSum(num);
            if (!map.containsKey(dSum)) {
                map.put(dSum, new PriorityQueue<>((a, b) -> b - a));
            }
            map.get(dSum).offer(num);
        }

        int max = -1;
        for (int key : map.keySet()) {
            if (map.get(key).size() >= 2) {
                int x = map.get(key).poll();
                int y = map.get(key).poll();
                max = Math.max(max, (x + y));
            }
        }

        return max;
    }

    public int digitSum(int num) {
        int ans = 0;
        while (num > 0) {
            int bit = num % 10;
            ans += bit;
            num = num / 10;
        }
        return ans;
    }
}