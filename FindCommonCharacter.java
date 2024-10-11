import java.util.*;

public class FindCommonCharacter {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words.length == 0) {
            return result;
        }
        String word1 = words[0];
        HashMap<Character, Integer> map = new HashMap<>();
        for (char w : word1.toCharArray()) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char w : words[i].toCharArray()) {
                temp.put(w, temp.getOrDefault(w, 0) + 1);
            }

            for (var key : map.keySet()) {
                if (!temp.containsKey(key)) {
                    map.put(key, 0);
                } else {
                    map.put(key, Math.min(map.get(key), temp.get(key)));
                }
            }
        }

        for (var key : map.keySet()) {
            for (int i = 1; i < map.get(key); i++) {
                result.add(Character.toString(key));
            }
        }
        return result;
    }
}