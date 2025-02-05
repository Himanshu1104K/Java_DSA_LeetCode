import java.util.*;

public class CheckIfOneStringCanBeMakeEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            char y = s2.charAt(i);
            if (x != y) {
                count++;
            }
            freqS1[x - 'a']++;
            freqS2[y - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqS1[i] != freqS2[i]) {
                return false;
            }
        }
        return count == 0 || count == 2;
    }
}