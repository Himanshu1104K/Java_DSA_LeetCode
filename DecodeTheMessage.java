import java.util.*;

public class DecodeTheMessage {
    public static String decodeMessage(String key, String message) {
        Map<Character, Character> alph = new HashMap<>();
        char i = 'a';
        for (char ch : key.toCharArray()) {
            if (ch != ' ' && !alph.containsKey(ch)) {
                alph.put(ch, i++);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                result.append(" ");
            } else {
                result.append(alph.get(ch));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }
}
