import java.util.*;

public class CheckIfArrayGood {
    public boolean isGood(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxElement = 0;
        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        if (nums.length != maxElement + 1) {
            return false;
        }

        if (map.getOrDefault(maxElement, 0) != 2) {
            return false;
        }

        for (int i = 1; i < maxElement; i++) {
            if (map.getOrDefault(i, 0) != 1) {
                return false;
            }
        }

        return true;
    }
}
