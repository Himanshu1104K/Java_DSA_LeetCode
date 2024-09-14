
public class LongSubArrMaxBitWiseAND {

    public static int longestSubarray(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int maxElem = Integer.MIN_VALUE;
        for (int num : nums) {
            if (maxElem < num) {
                maxElem = num;
            }
        }
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxElem) {
                count++;
                result = Math.max(count, result);
            } else {
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        longestSubarray(new int[]{311155, 311155, 311155, 311155, 311155, 311155, 311155, 311155, 201191, 311155});
    }

}
