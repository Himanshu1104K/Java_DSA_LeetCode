public class CountNumberOfMaximumBitwiseORSubset {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        return helper(0, nums, maxOr, 0);
    }

    public int helper(int i, int[] nums, int maxOr, int or) {
        if (i == nums.length) {
            if (or == maxOr) {
                return 1;
            } else {
                return 0;
            }
        }

        int prev = or;
        int take = helper(i + 1, nums, maxOr, (or | nums[i]));
        int notTake = helper(i + 1, nums, maxOr, prev);
        return take + notTake;
    }
}
