public class CountBeautifulSubstring1 {
    public int beautifulSubstrings(String s, int k) {
        int result = 0;
        int vowels = 0, consonants = 0;
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        // vowels++;
        // } else {
        // consonants++;
        // }

        // if (consonants != 0 && consonants == vowels && (vowels * consonants) % k ==
        // 0) {
        // result++;
        // }

        // }

        for (int i = 0; i < s.length(); i++) {
            vowels = 0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }

                consonants = (j - i + 1) - vowels;

                if (consonants == vowels && (vowels * consonants) % k == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
