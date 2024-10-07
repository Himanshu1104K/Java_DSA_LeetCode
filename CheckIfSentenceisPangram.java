
public class CheckIfSentenceisPangram {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        int alphabets[] = new int[26];
        for (char ch : sentence.toCharArray()) {
            int i = ch - 'a';
            alphabets[i]++;
        }

        for (int alpha : alphabets) {
            if (alpha < 1) {
                return false;
            }
        }
        return true;
    }
}
