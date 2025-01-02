public class CountVowelStringInRange {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] freq = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (isVowel(word)) {
                freq[i] = 1;
            }
            if (i > 0) {
                freq[i] += freq[i - 1];
            }
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0) {
                result[i] = freq[right];
            } else {
                result[i] = freq[right] - freq[left - 1];
            }
        }

        return result;
    }

    public boolean isVowel(String word) {
        char ch = word.charAt(0);
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return false;
        }
        ch = word.charAt(word.length() - 1);
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            return false;
        }
        return true;
    }
}