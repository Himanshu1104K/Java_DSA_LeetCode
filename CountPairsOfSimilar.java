import java.util.*;

public class CountPairsOfSimilar {
    public int similarPairs(String[] words) {
        int n = words.length;
        int pair = 0;
        for (int i = 0; i < n - 1; i++) {
            Set<Character> word1 = new HashSet<>();
            for (char ch : words[i].toCharArray()) {
                word1.add(ch);
            }
            for (int j = i + 1; j < n; j++) {
                Set<Character> word2 = new HashSet<>();
                for (char ch : words[j].toCharArray()) {
                    word2.add(ch);
                }

                if (word1.containsAll(word2) && word2.containsAll(word1)) {
                    pair++;
                }
            }
        }
        return pair;
    }
}