import java.util.*;

public class LargestPositiveIntegerThatExistWIthItsNegative {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = -1;

        for (int num : nums) {
            if (set.contains(-num)) {
                max = Math.max(num, max);
            }
        }

        return max;
    }
}