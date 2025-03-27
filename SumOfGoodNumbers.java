public class SumOfGoodNumbers {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i - k >= 0 || i + k < n) {
                if (i - k >= 0 && nums[i - k] >= nums[i]) {
                    continue;
                }
                if (i + k < n && nums[i + k] >= nums[i]) {
                    continue;
                }
            }
            ans += nums[i];
        }
        return ans;
    }
}