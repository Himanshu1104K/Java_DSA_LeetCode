import java.util.*;

public class MinStepsToMakeTwoStringAnagrams {
    public int minSteps(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        for (char key : sMap.keySet()) {
            int sCount = sMap.get(key);
            int tCount = tMap.getOrDefault(key, 0);
            if (sCount > tCount) {
                ans += (sCount - tCount);
            }
        }
        for (char key : tMap.keySet()) {
            int tCount = tMap.get(key);
            int sCount = sMap.getOrDefault(key, 0);
            if (tCount > sCount) {
                ans += (tCount - sCount);
            }
        }

        return ans;
    }
}
