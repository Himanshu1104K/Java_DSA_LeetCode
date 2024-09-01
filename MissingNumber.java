import java.util.*;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0] == 1 ? 0 : 1;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

    }
}