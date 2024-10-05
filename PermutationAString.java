import java.util.*;

public class PermutationAString {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) {
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        while (i < n2 && !freq.containsKey(s2.charAt(i))) {
            i++;
        }

        while (i <= n2 - n1) {
            var freq2 = new HashMap<>(freq);
            int j;
            for (j = i; j < (i + n1); j++) {
                char ch = s2.charAt(j);
                if (freq2.containsKey(ch) && freq2.get(ch) > 0) {
                    freq2.put(ch, freq2.get(ch) - 1);
                } else {
                    break;
                }
            }
            if (j == (i + n1)) {
                return true;
            }
            i++;
        }
        return false;
    }
}