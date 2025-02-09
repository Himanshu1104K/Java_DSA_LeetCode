import java.util.*;

public class K_DiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int pairs = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) > 1) {
                    pairs++;
                }
            } else {
                if (map.containsKey(key + k)) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
