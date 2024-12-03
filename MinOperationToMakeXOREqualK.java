public class MinOperationToMakeXOREqualK {
    public int minOperations(int[] nums, int k) {
        int result = 0;
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        while (k != 0 || xor!= 0) {
            int kbit = k & 1;
            int xbit = xor & 1;
            if (kbit != xbit) {
                result++;
            }
            k = k >> 1;
            xor = xor >> 1;
        }

        return result;
    }
}
