public class CheckIfNoAscInSentence {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int x = -1;

        for (var word : words) {
            if (word.matches("\\d+")) {
                int curNum = Integer.parseInt(word);
                if (curNum <= x) {
                    return false;
                }
                x = curNum;
            }
        }
        return true;
    }
}
