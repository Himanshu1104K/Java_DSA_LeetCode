public class MinSumOfMountainTriplet {
    public int minimumSum(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        boolean gotMountain = false;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        gotMountain = true;
                        minSum = Math.min(minSum, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return gotMountain ? minSum : -1;
    }
}
