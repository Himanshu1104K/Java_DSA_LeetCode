public class LongestStrictlyIncOrDecSubArray {
    public static int longestMonotonicSubarray(int[] nums) {
        int incLen = 1;
        int decLen = 1;
        int maxLen = 1;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                while (i + 1 < n && nums[i] > nums[i + 1]) {
                    decLen++;
                    i++;
                }
                decLen = 1;
            }
            maxLen = Math.max(maxLen, decLen);
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                while (i + 1 < n && nums[i] < nums[i + 1]) {
                    incLen++;
                    i++;
                }
                incLen = 1;
            }
            maxLen = Math.max(incLen, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        longestMonotonicSubarray(new int[] { 1, 4, 3, 3, 2 });
    }
}