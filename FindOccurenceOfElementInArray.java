import java.util.*;

public class FindOccurenceOfElementInArray {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add(i);
        }
        int n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int query = queries[i];
            if (map.containsKey(x) && map.get(x).size() >= query) {
                ans[i] = map.get(x).get(query - 1);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
