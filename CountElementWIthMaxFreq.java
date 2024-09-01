import java.util.*;

public class CountElementWIthMaxFreq {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int a : nums) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (int a : map.values()) {
            if (a > max) {
                max = a;
            }
        }
        int result = 0;
        for (int a : map.values()) {
            if (a == max) {
                result += a;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
