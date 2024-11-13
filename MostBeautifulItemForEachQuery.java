import java.util.*;

public class MostBeautifulItemForEachQuery {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int max = 0;
        for (int[] item : items) {
            max = Math.max(max, item[1]);
            map.put(item[0], max);
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            Map.Entry<Integer, Integer> entry = map.floorEntry(query);
            result[i] = entry != null ? entry.getValue() : 0;
        }

        return result;
    }
}