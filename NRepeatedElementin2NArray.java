import java.util.*;

public class NRepeatedElementin2NArray {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                result = num;
                break;
            }
        }
        return result;
    }
}