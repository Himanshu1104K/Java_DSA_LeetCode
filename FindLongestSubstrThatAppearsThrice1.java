import java.util.*;

public class FindLongestSubstrThatAppearsThrice1 {
    public int maximumLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = 0;

        return -1;
    }
}