
import java.util.*;
import javax.naming.spi.DirStateFactory;

public class LetterCombPhone {
    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<Character, String[]> map = new HashMap<>();
        map.put('2', new String[] { "a", "b", "c" });
        map.put('3', new String[] { "d", "e", "f" });
        map.put('4', new String[] { "g", "h", "i" });
        map.put('5', new String[] { "j", "k", "l" });
        map.put('6', new String[] { "m", "n", "o" });
        map.put('7', new String[] { "p", "q", "r", "s" });
        map.put('8', new String[] { "t", "u", "v" });
        map.put('9', new String[] { "w", "x", "y", "z" });
        System.out.println(map);

        List<String> temp1 = new ArrayList<>(Arrays.asList(map.get(digits.charAt(0))));

        if (digits.length() == 1) {
            return temp1;
        }
        List<String> result = new ArrayList<>();

        return result;
    }

    public static void main(String[] args) {
        letterCombinations("5");
    }
}