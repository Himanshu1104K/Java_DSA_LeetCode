public class CheckIfWordIsPrefixOfWordInSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int n = searchWord.length();
        int ans = 0;
        for (String word : sentence.split(" ")) {
            ans++;
            if (word.length() >= n) {
                if (word.substring(0, n ).equals(searchWord)) {
                    return ans;
                }
            }
        }
        return -1;
    }
}
