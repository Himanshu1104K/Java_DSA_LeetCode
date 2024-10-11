import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int x = 0;
        for (int i : arr2) {
            while (map.get(i) != 0) {
                arr1[x] = i;
                map.put(i, map.get(i) - 1);
                x++;
            }
            map.remove(i);
        }

        for (var key : map.keySet()) {
            while (map.get(key) != 0) {
                arr1[x] = key;
                map.put(key, map.get(key) - 1);
                x++;
            }
        }
        return arr1;
    }
}
