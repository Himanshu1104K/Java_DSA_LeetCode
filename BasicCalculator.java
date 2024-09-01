import java.util.Stack;

public class BasicCalculator {
    public static int calculate(String s) {
        if (s.length() == 1) {
            char a = s.charAt(0);
            if (a >= '0' && a <= '9') {
                return a;
            }
        }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= '0' && a <= '9') {
                stack.push(((int) a - '0'));
            } else if (a == '+') {
                int x = stack.pop();
                int y = stack.pop();
                result += (x + y);
            }
        }
        System.out.println(stack);
        return result;
    }

    public static void main(String[] args) {
        calculate("(1+(4+5+2)-3)+(6+8)");
    }
}