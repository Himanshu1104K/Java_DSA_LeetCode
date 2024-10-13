import java.util.*;

public class FindTheDiffTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (int num : nums2) {
            if (!map.containsKey(num) && !result.get(1).contains(num)) {
                result.get(1).add(num);
            } else {
                map.put(num, 0);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) != 0) {
                result.get(0).add(key);
            }
        }

        return result;
    }
}
