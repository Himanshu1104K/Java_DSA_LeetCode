
public class FindPowerOfKSizeSubarr {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n - k + 1];
        int idx = 0;
        for (int i = 0; i <= n - k; i++) {
            boolean isConsicutive = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j + 1] != nums[j] + 1) {
                    isConsicutive = false;
                    break;
                }
            }
            if (isConsicutive) {
                result[idx++] = nums[i + k - 1];
            } else {
                result[idx++] = -1;
            }
        }

        return result;
    }
}