import java.util.*;

public class SumOfValuesAtIndexWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                result += nums.get(i);
            }
        }
        return result;
    }
}