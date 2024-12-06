import java.util.*;

public class ReplaceElementInArray {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int[] operation : operations) {
            map.put(operation[1], map.get(operation[0]));
            map.remove(operation[0]);
        }

        for (int key : map.keySet()) {
            nums[map.get(key)] = key;
        }
        return nums;
    }
}
