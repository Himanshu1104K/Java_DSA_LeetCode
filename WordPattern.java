import java.util.*;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if (s.split(" ").length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        int i = 0;
        for (String str : s.split(" ")) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (!map.containsValue(str)) {
                    map.put(pattern.charAt(i), str);
                } else {
                    return false;
                }
            } else if (!map.get(pattern.charAt(i)).equals(str)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
