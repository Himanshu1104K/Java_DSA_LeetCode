import java.util.*;

public class SplitStringBySeperator {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String[] arr = word.split(Character.toString(separator));
            System.out.println(Character.toString(separator));
            for (String val : arr) {
                if (!val.isEmpty()) {
                    result.add(val);
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
