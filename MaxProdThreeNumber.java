import java.util.*;

public class MaxProdThreeNumber {
    public int maximumProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            int res = nums[n - 1] * nums[n - 2] * nums[n - 3];
            return res;
    }
}
