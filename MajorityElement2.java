
import java.util.*;

public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        for (int val : numFreq.keySet()) {
            if (numFreq.get(val) > Math.floor(nums.length / 3)) {
                result.add(val);
            }
        }
        return result;
    }
}
