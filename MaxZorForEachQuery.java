public class MaxZorForEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int result[] = new int[n];

        int TwoMax = (int) Math.pow(2, maximumBit);
        int CurXor = 0;
        for (int i = 0; i < n; i++) {
            CurXor ^= nums[i];
            result[n - i - 1] = CurXor ^ (TwoMax - 1);
        }
        return result;
    }
}