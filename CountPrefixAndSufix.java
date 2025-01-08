public class CountPrefixAndSufix {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean isPrefixAndSuffix(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        if (n1 > n2) {
            return false;
        }

        return word1.equals(word2.substring(0, n1)) && word1.equals(word2.substring(n2 - n1));
    }
}