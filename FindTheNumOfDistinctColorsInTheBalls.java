import java.util.*;

public class FindTheNumOfDistinctColorsInTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        Map<Integer, Integer> colorMap = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        Set<Integer> colors = new HashSet<>();

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int key = queries[i][0];
            int color = queries[i][1];

            if (colorMap.containsKey(key)) {
                int oldColor = colorMap.get(key);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);

                if (colorCount.get(oldColor) == 0) {
                    colors.remove(oldColor);
                }
            }
            colorMap.put(key, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            colors.add(color);

            ans[i] = colors.size();
        }

        return ans;
    }
}