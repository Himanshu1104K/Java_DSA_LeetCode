public class MaxStrongPairXOR1 {
    public int maximumStrongPairXor(int[] nums) {
        int result = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                int x = nums[i];
                int y = nums[j];
                int sub = Math.abs(x - y);
                if (sub <= Math.min(x, y)) {
                    int xor = x ^ y;
                    if (xor >= result) {
                        result = xor;
                    }
                }
            }
        }
        return result;
    }
}
