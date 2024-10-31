public class MaxScoreAfterSpittingString {
    public int maxScore(String s) {
        int ones = 0;
        int zeros = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                ones++;
        }
        int left = 0;
        int maxScore = 0;
        while (left < s.length() - 1) {
            if (s.charAt(left) == '0')
                zeros++;
            else
                ones--;

            int curScore = zeros + ones;
            maxScore = Math.max(curScore, maxScore);
            left++;
        }

        return maxScore;
    }
}