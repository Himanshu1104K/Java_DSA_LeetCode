import java.util.*;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        int count = 0;
        for (int i = n; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            if (count == 3) {
                return nums[i - 1];
            }
        }
        return nums[n];
    }
}
