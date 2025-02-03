import java.util.*;

public class CountNoOfDistinctIntegerAfterReverse {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            StringBuilder str = new StringBuilder(Integer.toString(num));
            set.add(num);
            set.add(Integer.valueOf(str.reverse().toString()));
        }
        return set.size();
    }
}
