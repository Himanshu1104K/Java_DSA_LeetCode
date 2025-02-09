import java.util.*;

public class CountNumberOfBadPairs {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        long goodPairs = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i] - i;
            goodPairs += numMap.getOrDefault(num, 0);
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        long total = (long) (n * (n - 1)) / 2;
        return total - goodPairs;
    }
}