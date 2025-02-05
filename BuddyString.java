public class BuddyString {
    public boolean buddyStrings(String s, String goal) {
        int count = 0;
        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];
        boolean valid = false;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = goal.charAt(i);
            if (x != y) {
                count++;
            }
            freqS1[x - 'a']++;
            freqS2[y - 'a']++;
            if (freqS1[x - 'a'] >= 2) {
                valid = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freqS1[i] != freqS2[i]) {
                return false;
            }
        }
        if (count == 2) {
            return true;
        }
        if (count == 0 && valid) {
            return true;
        }

        return false;
    }
}
