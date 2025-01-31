import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelong {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int key = groupSizes[i];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
                map.get(key).add(i);
            } else {
                if (map.get(key).size() == key) {
                    result.add(map.get(key));
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(i);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key).size() == key) {
                result.add(map.get(key));
            }
        }

        return result;
    }
}
