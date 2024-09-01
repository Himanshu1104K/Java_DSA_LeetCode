
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char ch : s.toCharArray()) {
        // if (map.containsKey(ch)) {
        // map.put(ch, map.get(ch) + 1);
        // } else {
        // map.put(ch, 1);
        // }
        // }

        // for (char ch : t.toCharArray()) {
        // if (!map.containsKey(ch)) {
        // return false;
        // } else {
        // map.put(ch, map.get(ch) - 1);
        // }
        // }

        // for (int val : map.values()) {
        // if (val != 0) {
        // return false;
        // }
        // }

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

    public static void main(String[] args) {
    }
}
