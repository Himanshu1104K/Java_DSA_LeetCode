import java.util.*;

public class CustomSortString {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : order.toCharArray()) {
            if (map.containsKey(ch)) {
                for (int i = 1; i <= map.get(ch); i++) {
                    result.append(ch);
                }
            }
            map.remove(ch);
        }
        for (char ch : map.keySet()) {
            for (int i = 1; i <= map.get(ch); i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
