public class MaxXORAfterOperation {
    public int maximumXOR(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans |= num;
        }
        return ans;
    }
}
