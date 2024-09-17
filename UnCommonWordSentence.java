
import java.util.*;

public class UnCommonWordSentence {

    public String[] uncommonFromSentences(String s1, String s2, boolean str2) {
        Map<String, Integer> map = new HashMap<>();
        for (var str : s1.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (var str : s2.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (var key : map.keySet()) {
            int value = map.get(key);
            if (value < 2) {
                result.add(key);
            }
        }
        String[] result2 = new String[result.size()];
        for (int i = 0; i < result2.length; i++) {
            result2[i] = result.get(i);
        }
        return result2;
    }
}
