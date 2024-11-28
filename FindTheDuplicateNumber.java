public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) {
                nums[num - 1] = -1 * Math.abs(nums[num - 1]);
            } else {
                return num;
            }
        }
        return -1;
    }
}
