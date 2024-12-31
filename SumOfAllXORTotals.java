public class SumOfAllXORTotals {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] xor = new int[n];
        xor[0] = nums[0];
        for (int i = 1; i < n; i++) {
            xor[i] = xor[i - 1] ^ nums[i];
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                result += (xor[j] ^ xor[i]);
            }
        }
        return result;
    }
}