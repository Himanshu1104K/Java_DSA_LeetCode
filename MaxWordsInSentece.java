public class MaxWordsInSentece {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
        for (var sentence : sentences) {
            if (maxLen < sentence.split(" ").length) {
                maxLen = sentence.split(" ").length;
            }
        }
        return maxLen;
    }
}
