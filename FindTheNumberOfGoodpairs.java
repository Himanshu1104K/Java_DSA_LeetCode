import java.util.*;

public class FindTheNumberOfGoodpairs {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> n1 = new HashMap<>();
        Map<Integer, Integer> n2 = new HashMap<>();
        for (int num : nums1) {
            n1.put(num, n1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            int x = num * k;
            n2.put(x, n2.getOrDefault(x, 0) + 1);
        }

        int pair = 0;
        for (int key1 : n1.keySet()) {
            for (int key2 : n2.keySet()) {
                if (key1 % key2 == 0) {
                    pair += (n1.get(key1) * n2.get(key2));
                }
            }
        }

        return pair;
    }
}
