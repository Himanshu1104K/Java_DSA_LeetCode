public class MinValueAfterReplacementByDigitSum {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            String num = Integer.toString(nums[i]);
            int val = 0;
            for (char ch : num.toCharArray()) {
                val += (ch - '0');
            }
            nums[i] = val;
            min = Math.min(nums[i], min);
        }
        return min;
    }
}
