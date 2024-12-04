public class MakeStringSubsequenceUsingCyclicInc {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        int nS1 = str1.length();
        int nS2 = str2.length();

        while (i < nS1) {
            if (j == nS2) {
                return true;
            }

            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(j);

            System.out.println((ch1 + 1) % 97);

            if (ch1 == ch2 || ((ch1 - 'a' + 1) % 26 + 'a') == ch2) {
                j++;
            }
            i++;
        }

        return j == nS2;
    }
}