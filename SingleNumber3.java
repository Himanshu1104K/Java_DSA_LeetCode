public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        xor &= -xor;
        int result[] = { 0, 0 };
        for (int num : nums) {
            if ((xor & num) != 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}
