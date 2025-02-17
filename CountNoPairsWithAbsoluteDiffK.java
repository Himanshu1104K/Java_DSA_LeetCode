import java.util.*;

public class CountNoPairsWithAbsoluteDiffK {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            ans += map.getOrDefault(num + k, 0);
            ans += map.getOrDefault(num - k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
