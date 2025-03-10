public class CountPartitionsWithEvenSumDiff {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int left = 0;
        int right = 0;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int num = nums[i];
            left += num;
            right = sum - left;
            if (left % 2 == right % 2) {
                ans++;
            }
        }

        return ans;
    }
}
