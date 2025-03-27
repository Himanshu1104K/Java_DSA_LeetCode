public class MaxDiffBetweenEvenAndOddFreq {
    public static int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f % 2 == 0 && f != 0) {
                minEven = Math.min(f, minEven);
            } else {
                maxOdd = Math.max(maxOdd, f);
            }
        }
        return maxOdd - minEven;
    }

    public static void main(String[] args) {
        maxDifference("aaaaabbc");
    }
}
