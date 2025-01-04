import java.util.*;

public class PartitionArrayGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        for (int num : nums) {
            if (pivot == num) {
                large.addFirst(num);
            } else if (num < pivot) {
                small.add(num);
            } else {
                large.add(num);
            }
        }
        int i = 0;
        for (int num : small) {
            nums[i++] = num;
        }
        for (int num : large) {
            nums[i++] = num;
        }
        return nums;
    }
}
