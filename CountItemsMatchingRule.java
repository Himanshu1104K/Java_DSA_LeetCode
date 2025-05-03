import java.util.*;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i;
        if (ruleKey.equals("type")) {
            i = 0;
        } else if (ruleKey.equals("color")) {
            i = 1;
        } else {
            i = 2;
        }

        int result = 0;
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue)) {
                result++;
            }
        }

        return result;
    }
}