import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramInString {
    public List<Integer> findAnagrams(String s, String p) {
        int pLen = p.length();
        int sLen = s.length();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sLen - pLen + 1; i++) {
            boolean isAna = isAnagram(s.substring(i, i + pLen + 1), p);
            if (isAna) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[((int) s.charAt(i) - 'a')]++;
            count[((int) t.charAt(i) - 'a')]--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
