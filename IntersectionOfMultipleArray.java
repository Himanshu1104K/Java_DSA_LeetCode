import java.util.*;

public class IntersectionOfMultipleArray {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] numArr : nums) {
            for (int num : numArr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                result.add(key);
            }
        }
        return result;
    }
}