public class CountNoOfBeautifulSubarray {
    public long beautifulSubarrays(int[] nums) {
        int n = nums.length;
        int[] xor = new int[n];
        xor[0] = nums[0];

        for (int i = 1; i < n; i++) {
            xor[i] = xor[i - 1] ^ nums[i];
        }

        long result = 0;

        for (int start = 0; start < n - 1; start++) {
            for (int end = start + 1; end < n; end++) {
                if (start == 0 && xor[end] == 0) {
                    result++;
                } else if (start > 0 && (xor[start - 1] ^ xor[end]) == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
