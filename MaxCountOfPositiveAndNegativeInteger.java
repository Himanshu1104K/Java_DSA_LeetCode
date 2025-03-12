public class MaxCountOfPositiveAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] < 0) {
                neg++;
            }
            if (nums[i] > 0) {
                break;
            }
            i++;
        }
        return Math.max(neg, n - i);
    }
}