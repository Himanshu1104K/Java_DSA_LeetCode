import java.util.*;

public class DuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums.length <= 1) {
            return result;
        }
        for (int i : nums) {
            int n = Math.abs(i);
            if (nums[n - 1] > 0) {
                nums[n - 1] *=-1;
            } else {
                result.add(n);
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
