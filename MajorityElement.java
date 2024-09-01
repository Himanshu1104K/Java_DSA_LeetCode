import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int element = 0;
        for (int value : map.keySet()) {
            if (map.get(value) > max) {
                max = map.get(value);
                element = value;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });
    }
}
