import java.util.*;

public class MakeArrZeroBySubEqualNumber {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        int ans = set.size();
        return ans;
    }
}
