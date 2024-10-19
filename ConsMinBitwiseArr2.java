import java.util.*;

public class ConsMinBitwiseArr2 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            if (num % 2 == 0) {
                ans[i] = -1;
            } else {
                int lowestBit = Integer.lowestOneBit(num + 1);
                num -= lowestBit >> 1;
                ans[i] = num;
            }
        }

        return ans;
    }
}
