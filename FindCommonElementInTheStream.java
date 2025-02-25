import java.util.*;

public class FindCommonElementInTheStream {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        int answer1 = 0;
        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                answer1 += map1.get(key);
            }
        }
        int answer2 = 0;
        for (int key : map2.keySet()) {
            if (map1.containsKey(key)) {
                answer2 += map2.get(key);
            }
        }

        return new int[] { answer1, answer2 };
    }
}
