public class CountingWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int result = 0;
        for (String word : words) {
            if (word.length() >= n ? word.substring(0, n + 1).equals(pref) : false) {
                result++;
            }
        }
        return result;
    }
}