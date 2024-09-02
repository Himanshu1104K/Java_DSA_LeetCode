import java.util.*;

public class LongSubStrNoRep {

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int curLen = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(i - curLen));
                    curLen = curLen - 1;
                }
            }
            set.add(s.charAt(i));
            curLen++;
            maxLen = Math.max(curLen, maxLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {

    }
}
