
public class MinLengthOfStringAfterOperation {
    public int minimumLength(String s) {
        int length = 0;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int f : freq) {
            if (f >= 3) {
                if (f % 2 == 0) {
                    length += 2;
                } else {
                    length += 1;
                }
            } else {
                length += f;
            }
        }

        return length;
    }
}