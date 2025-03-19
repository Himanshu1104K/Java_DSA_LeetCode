import java.util.*;

public class RingsAndRods {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> rods = new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {
            rods.putIfAbsent(rings.charAt(i + 1), new HashSet<>());

            rods.get(rings.charAt(i + 1)).add(rings.charAt(i));
        }

        int result = 0;

        for (var set : rods.values()) {
            if (set.size() == 3) {
                result++;
            }
        }

        return result;
    }
}
