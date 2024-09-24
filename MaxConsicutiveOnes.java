
public class MaxConsicutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                while (i < nums.length && nums[i] != 0) {
                    curr++;
                    i++;
                }
                max = Math.max(curr, max);
                curr = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}