public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] freq = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            freq[num - 1]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (freq[i] == 0) {
                result[1] = i + 1;
            } else if (freq[i] == 2) {
                result[0] = i + 1;
            }
        }

        return result;
    }
}