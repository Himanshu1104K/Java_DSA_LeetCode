
import java.util.*;

public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : count.keySet()) {
            degree = Math.max(count.get(key), degree);
        }
        int minLen = 0;
        for (int key : count.keySet()) {
            if (degree == count.get(key)) {
                minLen = Math.min(minLen, last.get(key) - first.get(key));
            }
        }
        return minLen;
    }

    public static void main(String[] args) {

    }
}
