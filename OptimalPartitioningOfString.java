import java.util.*;

public class OptimalPartitioningOfString {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                result++;
                set = new HashSet<>();
            }
            set.add(ch);
        }
        return result;
    }
}
