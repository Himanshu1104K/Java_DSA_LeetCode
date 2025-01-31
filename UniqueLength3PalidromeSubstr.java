import java.util.*;

public class UniqueLength3PalidromeSubstr {
    public int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet<>();
        int n = s.length();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int first = -1, last = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ch) {
                    if (first == -1) {
                        first = i;
                    }
                    last = i;
                }
            }

            if (first != -1 && last != -1 && last - first > 1) {
                Set<Character> middleChar = new HashSet<>();

                for (int i = first + 1; i < last; i++) {
                    middleChar.add(s.charAt(i));
                }
                char end = s.charAt(first);
                for (char mCh : middleChar) {
                    set.add("" + end + mCh + end);
                }

            }

        }
        return set.size();
    }
}