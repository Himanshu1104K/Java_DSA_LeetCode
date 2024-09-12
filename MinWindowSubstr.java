public class MinWindowSubstr {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        int tFreq[] = new int[123];
        for (char ch : t.toCharArray()) {
            tFreq[ch]++;
        }
        char[] sElement = s.toCharArray();
        int left = 0, right = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        int find = t.length();
        while (right < sElement.length) {
            if (tFreq[sElement[right]] > 0)
                find--;
            tFreq[sElement[right]]--;
            right++;
            while (find == 0) {
                if (right - left < minlen) {
                    start = left;
                    minlen = right - left;
                }
                if (tFreq[sElement[left]] == 0)
                    find++;
                tFreq[sElement[left]]++;
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + right);
    }
}

// HashMap<Character, Integer> tmap = new HashMap<>();
// for (char ch : t.toCharArray()) {
// tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
// }

// int left = 0, right = 0;
// HashMap<Character, Integer> windowMap = new HashMap<>();
// int formed = 0;
// int required = tmap.size();
// int minlen = Integer.MAX_VALUE;
// String minString = "";
// while (right < s.length()) {
// char ch = s.charAt(right);
// windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
// if (tmap.containsKey(ch) && windowMap.get(ch).intValue() ==
// tmap.get(ch).intValue()) {
// formed++;
// }

// while (left <= right && formed == required) {
// ch = s.charAt(left);
// if (right - left + 1 < minlen) {
// minlen = right - left + 1;
// minString = s.substring(left, right + 1);
// }
// windowMap.put(ch, windowMap.get(ch) - 1);
// if (tmap.containsKey(ch) && windowMap.get(ch) < tmap.get(ch)) {
// formed--;
// }
// left++;
// }
// right++;
// }
// return minString;