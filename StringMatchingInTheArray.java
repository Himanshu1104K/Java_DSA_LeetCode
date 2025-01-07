import java.util.*;

public class StringMatchingInTheArray {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            boolean subStr = false;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (words[j].contains(words[i])) {
                        subStr = true;
                    }
                }
            }
            if (subStr) {
                result.add(words[i]);
            }
        }
        return result;
    }
}