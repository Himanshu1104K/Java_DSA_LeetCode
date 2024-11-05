import java.util.*;

public class NoDistinctAverage {
    public int distinctAverages(int[] nums) {
        Set<Double> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            Double out = (double) (nums[left++] + nums[right--]) / 2;
            set.add(out);
        }
        return set.size();
    }
}
