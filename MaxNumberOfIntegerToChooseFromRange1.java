import java.util.*;

public class MaxNumberOfIntegerToChooseFromRange1 {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int ban : banned) {
            if (ban <= n) {
                set.add(ban);
            }
        }
        int result = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i) && sum + i < maxSum) {
                sum += i;
                result++;
            }
        }
        return result;
    }
}