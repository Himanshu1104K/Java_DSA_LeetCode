import java.util.*;

public class KthSmallestDistance {
    public int smallestDistancePair(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int idx = k % nums.length;
        int small = nums[idx + (int) (k / nums.length)];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[i + 1]) {
                k--;
            }
            if (k == 0) {
                return nums[i] - small;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
