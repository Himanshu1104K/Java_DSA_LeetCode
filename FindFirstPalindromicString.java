public class FindFirstPalindromicString {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for (String word : words) {
            StringBuilder str = new StringBuilder(word);
            if (str.reverse().toString().equals(word)) {
                ans = word;
                break;
            }
        }
        return ans;
    }
}
