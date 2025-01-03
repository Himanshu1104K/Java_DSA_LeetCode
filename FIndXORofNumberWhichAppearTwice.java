import java.util.*;

public class FIndXORofNumberWhichAppearTwice {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                result ^= key;
            }
        }
        return result;
    }
}
