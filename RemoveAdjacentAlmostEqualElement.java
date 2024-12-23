public class RemoveAdjacentAlmostEqualElement {
    public int removeAlmostEqualCharacters(String word) {
        int result = 0;
        int i = 0;
        while (i < word.length() - 1) {
            char x = word.charAt(i);
            char y = word.charAt(i + 1);
            if (Math.abs(x - y) <= 1) {
                result++;
                i += 2;
            } else {
                i++;
            }

        }
        return result;
    }
}