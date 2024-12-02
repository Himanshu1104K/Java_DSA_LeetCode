public class CountPrefixOfString {
    public int countPrefixes(String[] words, String s) {
        int result = 0;
        int n = s.length();
        for (String word : words) {
            int x = word.length();
            if (x <= n ? s.substring(0, x).equals(word) : false) {
                result++;
            }
        }
        return result;
    }
}
