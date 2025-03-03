import java.util.*;

public class FindMaxNumOfStringPairs {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> seen = new HashSet<>();
        int result = 0;
        for (String word : words) {
            String w = new StringBuilder(word).reverse().toString();
            if (seen.contains(w)) {
                result++;
            } else {
                seen.add(word);
            }
        }

        return result;
    }
}