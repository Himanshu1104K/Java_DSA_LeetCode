import java.util.*;

public class SortVowelsInString {
    public String sortVowels(String s) {
        List<Character> vowel = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowel.add(ch);
            }
        }
        Collections.sort(vowel);

        StringBuilder str = new StringBuilder();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                str.append(vowel.get(i++));
            } else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
