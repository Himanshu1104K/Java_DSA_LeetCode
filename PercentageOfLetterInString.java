public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        int val = 0;
        for (char ch : s.toCharArray()) {
            if (ch == letter) {
                val++;
            }
        }
        float out = (val / s.length()) * 100;
        return (int) out;
    }
}
