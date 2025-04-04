import java.util.*;

public class FirstToAppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            } else {
                set.add(ch);
            }
        }
        return s.charAt(s.length() - 1);
    }
}
