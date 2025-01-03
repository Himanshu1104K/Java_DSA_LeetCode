public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        int result = 0;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long curSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curSum += nums[i];
            sum -= nums[i];
            if (curSum >= sum) {
                result++;
            }

        }

        return result;
    }
}
