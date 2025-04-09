public class ReverseWordsInString3 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                result.append(word.reverse());
                result.append(ch);
                word = new StringBuilder();
            } else {
                word.append(ch);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }
}
