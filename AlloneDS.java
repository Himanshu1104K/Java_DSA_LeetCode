import java.util.*;

public class AlloneDS {
    Map<String, Integer> map;
    int minKey = Integer.MAX_VALUE;
    int maxKey = Integer.MIN_VALUE;
    String minString = "";
    String maxString = "";

    public AlloneDS() {
        map = new HashMap<>();
    }

    public void inc(String key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
        if (minKey >= map.get(key)) {
            minString = key;
            minKey = map.get(key);
        }
        if (maxKey <= map.get(key)) {
            maxString = key;
            maxKey = map.get(key);
        }
    }

    public void dec(String key) {
        if (map.containsKey(key)) {
            if (map.get(key) == 1) {
                map.remove(key);
            } else {
                map.put(key, map.get(key) - 1);
            }
        }
    }

    public String getMaxKey() {
        return maxString;
    }

    public String getMinKey() {
        return minString;
    }
}