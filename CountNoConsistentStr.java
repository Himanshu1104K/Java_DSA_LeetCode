
import java.util.*;

public class CountNoConsistentStr {

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }
        int result = 0;
        for (String word : words) {
            int bit = 0;
            for (char w : word.toCharArray()) {
                if (!set.contains(w)) {
                    bit++;
                    break;
                }
            }
            if (bit != 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
