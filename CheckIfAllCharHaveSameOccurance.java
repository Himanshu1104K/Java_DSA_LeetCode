import java.util.*;

public class CheckIfAllCharHaveSameOccurance {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int val = freq.get(s.charAt(0));

        for (int value : freq.values()) {
            if (value != val) {
                return false;
            }
        }
        return true;
    }
}