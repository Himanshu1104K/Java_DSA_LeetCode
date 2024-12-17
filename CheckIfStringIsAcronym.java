import java.util.*;

public class CheckIfStringIsAcronym {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        int i = 0;
        for (String word : words) {
            if (s.charAt(i) != word.charAt(0)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
