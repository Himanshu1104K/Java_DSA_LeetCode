
import java.util.*;

public class InterSectionofTwoArray2 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] resultArr = new int[result.size()];
        int i = 0;
        for (int val : result) {
            resultArr[i++] = val;
        }

        return resultArr;
    }

    public static void main(String[] args) {

    }
}
