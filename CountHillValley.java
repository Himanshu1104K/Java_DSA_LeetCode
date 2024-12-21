public class CountHillValley {
    public int countHillValley(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }

            if (j < nums.length) {
                if ((nums[i] > nums[i - 1] && nums[i] > nums[j]) || (nums[i] < nums[i - 1] && nums[i] < nums[j])) {
                    result++;
                }
            }

        }
        return result;
    }
}