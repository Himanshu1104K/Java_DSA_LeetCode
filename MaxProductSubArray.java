public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            prod *= num;
            if (prod > max) {
                max = prod;
            }
            if (prod == 0) {
                prod = 1;
            }
        }
        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            prod *= num;
            if (prod > max) {
                max = prod;
            }
            if (prod == 0) {
                prod = 1;
            }
        }
        return max;
    }
}
