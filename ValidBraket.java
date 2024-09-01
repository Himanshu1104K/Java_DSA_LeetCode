import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidBraket {
    public static boolean isValid(String s) {
        if(s.length()%2!=0|| s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        ArrayList<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                list.add(ch);
            }else if (list.isEmpty()) {
                break;
            } 
            else if (map.get(ch).equals(list.getLast())) {
                list.removeLast();
            }
        }
        if (list.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("])"));
    }
}
