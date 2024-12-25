public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        } else if (word.equals(word.toLowerCase())) {
            return true;
        } else {
            String out = word.substring(0, 1).toUpperCase() + word.substring(1);
            return out.equals(word);
        }
    }
}
