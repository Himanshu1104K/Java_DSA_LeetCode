import java.util.*;

public class MaxNumberOfPairLeft {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[2];
        int pair = 0;
        int leftOver = 0;
        for (int key : map.keySet()) {
            leftOver += map.get(key) % 2;
            pair += map.get(key) / 2;
        }

        ans[0] = pair;
        ans[1] = leftOver;
        return ans;
    }
}
