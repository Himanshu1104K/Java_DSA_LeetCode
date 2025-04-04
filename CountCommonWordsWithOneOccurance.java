import java.util.*;

public class CountCommonWordsWithOneOccurance {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> freq1 = new HashMap<>();
        for (String word : words1) {
            freq1.put(word, freq1.getOrDefault(word, 0) + 1);
        }

        Map<String, Integer> freq2 = new HashMap<>();
        for (String word : words2) {
            freq2.put(word, freq2.getOrDefault(word, 0) + 1);
        }

        int ans = 0;
        for (String key : freq1.keySet()) {
            if (freq2.getOrDefault(key, 0) == 1 && freq1.get(key) == 1) {
                ans++;
            }
        }

        return ans;
    }
}
