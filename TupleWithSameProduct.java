import java.util.*;

public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                result += 8 * count.getOrDefault(product, 0);
                count.put(product, count.getOrDefault(product, 0) + 1);
            }
        }
        return result;
    }
}