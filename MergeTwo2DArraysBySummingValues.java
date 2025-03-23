import java.util.*;

public class MergeTwo2DArraysBySummingValues {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] num : nums1) {
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }
        for (int[] num : nums2) {
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }

        int[][] ans = new int[map.size()][2];
        int i = 0;
        for (int key : map.keySet()) {
            ans[i++] = new int[] { key, map.get(key) };
        }

        return ans;
    }

    public static void main(String[] args) {
        mergeArrays(new int[][] { { 1, 2 }, { 2, 3 }, { 4, 5 } }, new int[][] { { 1, 4 }, { 3, 2 }, { 4, 1 } });
    }
}
