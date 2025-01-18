import java.util.*;

public class KeyBoardRows {
    public String[] findWords(String[] words) {
        String[] keys = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        List<String> out = new ArrayList<>();
        for (String word : words) {
            int i;
            if (keys[0].indexOf(word.toLowerCase().charAt(0)) != -1) {
                i = 0;
            } else if (keys[1].indexOf(word.toLowerCase().charAt(0)) != -1) {
                i = 1;
            } else {
                i = 2;
            }
            boolean valid = true;
            for (char ch : word.toLowerCase().toCharArray()) {
                if (keys[i].indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                out.add(word);
            }

        }
        return out.toArray(new String[0]);
    }
}