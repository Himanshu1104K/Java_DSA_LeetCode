public class MergeStringAlternatively {
    public String mergeAlternately(String word1, String word2) {
        int x = 0;
        int y = 0;
        boolean turn = false;
        StringBuilder result = new StringBuilder();
        while (x < word1.length() && y < word2.length()) {
            if (!turn) {
                result.append(word1.charAt(x++));
            } else {
                result.append(word2.charAt(y++));
            }
            turn = !turn;
        }

        if (x < word1.length()) {
            result.append(word1.substring(x));
        }
        if (y < word2.length()) {
            result.append(word2.substring(y));
        }
        return result.toString();
    }
}