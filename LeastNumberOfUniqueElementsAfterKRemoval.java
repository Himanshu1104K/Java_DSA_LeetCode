import java.util.*;

public class LeastNumberOfUniqueElementsAfterKRemoval {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);

        int uniqueCount = freq.size();

        for (int f : freq) {
            if (k >= f) {
                k -= f;
                uniqueCount--;
            } else {
                break;
            }
        }

        return uniqueCount;
    }
}
