import java.util.*;

public class OccurenceAfterBygram {
    public String[] findOcurrences(String text, String first, String second) {
        if (text.length() == 0) {
            return new String[0];
        }
        List<String> list = new ArrayList<>();
        String[] textArr = text.split(" ");
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].equals(first)) {
                if (i + 1 < textArr.length && textArr[i + 1].equals(second)) {
                    if (i + 2 < textArr.length) {
                        list.add(textArr[i + 2]);
                    }
                }
            }
        }
        String[] result = new String[list.size()];
        int i = 0;
        for (var third : list) {
            result[i++] = third;
        }
        return result;
    }
}
