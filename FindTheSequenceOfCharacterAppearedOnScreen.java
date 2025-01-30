import java.util.*;

public class FindTheSequenceOfCharacterAppearedOnScreen {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for (char ch : target.toCharArray()) {
            char current = 'a';
            while (current != ch) {
                str.append(current);
                result.add(new String(str));
                str.deleteCharAt(str.length() - 1);

                if (current == 'z') {
                    current = 'a';
                } else {
                    current++;
                }
            }
            str.append(ch);
            result.add(new String(str));
        }

        return result;
    }
}