import java.util.*;

public class SenderWithLargestWords {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < senders.length; i++) {
            map.put(senders[i], map.getOrDefault(senders[i], 0) + messages[i].split(" ").length);
        }
        int maxValue = 0;
        String maxString = "";
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val > maxValue) {
                maxValue = val;
                maxString = key;
            } else if (val == maxValue) {
                if (key.compareTo(maxString) > 0) {
                    maxString = key;
                }
            }
        }
        return maxString;
    }
}
