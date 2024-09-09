
import java.util.*;

public class LongestHarominSeq {
    public int findLHS(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int result = 0;
        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                result = Math.max(result, (map.get(i) + map.get(i + 1)));
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}