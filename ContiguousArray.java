public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] zeros = new int[n];
        int[] ones = new int[n];
        if (nums[0] == 0) {
            zeros[0] = 1;
        } else {
            ones[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] == 0) {
                zeros[i] = zeros[i - 1] + 1;
                ones[i] = ones[i - 1];
            } else {
                ones[i] = ones[i - 1] + 1;
                zeros[i] = zeros[i - 1];
            }
        }

        
        return 0;
    }
}