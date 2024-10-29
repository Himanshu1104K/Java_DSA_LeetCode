import java.util.*;

public class SmallestMissingInteger {
    public int missingInteger(int[] nums) {
        int left = 1;
        int right = nums.length - 1;
        int PrefSum = nums[0];
        while (left <= right && nums[left] == nums[left - 1] + 1) {
            PrefSum += nums[left++];
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(PrefSum)) {
            PrefSum++;
        }
        return PrefSum;
    }
}
