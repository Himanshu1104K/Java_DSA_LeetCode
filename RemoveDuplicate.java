public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int current = nums[0];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (current != nums[i]) {
                current = nums[i];
                nums[++idx] = nums[i];
            }
        }
        return idx + 1;
    }

    public static void main(String[] args) {

    }
}
