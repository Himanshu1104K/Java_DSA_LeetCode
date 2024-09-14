
import java.util.*;

public class InterSectionofTwoArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (var num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (!set.contains(num)) {
                set.remove(num);
            }
        }
        Integer[] result = set.toArray(new Integer[0]);
        int[] result1 = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            result1[i] = result[i];
        }
        return result1;
    }

    public static void main(String[] args) {

    }
}
