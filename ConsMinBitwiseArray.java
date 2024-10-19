import java.util.*;

public class ConsMinBitwiseArray {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            int num = nums.get(i);
            for (int j = 0; j < num; j++) {
                if ((j | j + 1) == num) {
                    ans[i] = j;
                    break;
                }
            }
        }

        return ans;
    }
}
