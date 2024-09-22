import java.util.*;

public class ReverseVowelOfString {
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int left = 0;
        int right = sArr.length - 1;
        while (left < right) {
            while (left < right && !set.contains(sArr[left])) {
                left++;
            }

            while (left < right && !set.contains(sArr[right])) {
                right--;
            }
            char temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;
            left++;
            right--;
        }
        return new String(sArr);
    }
}
