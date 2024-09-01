public class MaximumAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return 0.0;
        }
        double curAvg = 0;
        for (int i = 0; i < k; i++) {
            curAvg += nums[i];
        }

        double maxAvg = curAvg;

        for (int i = k; i < nums.length; i++) {
            curAvg += nums[i] - nums[i - k];
            maxAvg = Math.max(curAvg, maxAvg);
        }

        return maxAvg / k;
    }

    public static void main(String[] args) {
        int a = 0;
    }
}