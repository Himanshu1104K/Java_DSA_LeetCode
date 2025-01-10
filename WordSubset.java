import java.util.*;

public class WordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] bMax = count("");
        for (String word : words2) {
            int[] bCount = count(word);
            for (int i = 0; i < 26; i++) {
                bMax[i] = Math.max(bCount[i], bMax[i]);
            }
        }
        List<String> result = new ArrayList<>();

        search: for (String word : words1) {
            int[] aCount = count(word);
            for (int i = 0; i < 26; i++) {
                if (aCount[i] < bMax[i]) {
                    continue search;
                }
            }
            result.add(word);
        }

        return result;
    }

    public int[] count(String word) {
        int[] ans = new int[26];
        for (char ch : word.toCharArray()) {
            ans[ch - 'a']++;
        }
        return ans;
    }
}