import java.util.*;

public class RearrangeWordInSentence {
    public String arrangeWords(String text) {
        String[] words = text.split(" ");
        words[0] = words[0].toLowerCase();

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        words[0] = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);

        StringBuilder str = new StringBuilder();
        str.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            str.append(" ").append(words[i]);
        }
        return str.toString();
    }
}