
import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        HashMap<Character, Integer> magFreq = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            magFreq.put(ch, magFreq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!magFreq.containsKey(ch)) {
                return false;
            }
            if (magFreq.get(ch) > 0) {
                magFreq.put(ch, magFreq.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
