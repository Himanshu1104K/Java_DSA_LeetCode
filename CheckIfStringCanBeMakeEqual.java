import java.util.*;

public class CheckIfStringCanBeMakeEqual {
    public boolean checkStrings(String s1, String s2) {
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (i % 2 == 0) {
                even.put(ch, even.getOrDefault(ch, 0) + 1);
            } else {
                odd.put(ch, odd.getOrDefault(ch, 0) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (i % 2 == 0) {
                even.put(ch, even.getOrDefault(ch, 0) - 1);
                if (even.get(ch) < 0) {
                    return false;
                }
            } else {
                odd.put(ch, odd.getOrDefault(ch, 0) - 1);
                if (odd.get(ch) < 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
