import java.util.*;

public class FindTheUserActiveMinutes {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] log : logs) {
            int id = log[0];
            int min = log[1];
            map.putIfAbsent(id, new HashSet<>());
            map.get(id).add(min);
        }

        int[] ans = new int[k];

        for (int key : map.keySet()) {
            int uam = map.get(key).size();
            ans[uam - 1]++;
        }

        return ans;
    }
}
