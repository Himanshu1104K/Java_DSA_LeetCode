
import java.util.Stack;

public class ReversePolishExp {
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        } else if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (str.length() == 1) {
                if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {

                    int a = stack.pop();
                    int b = stack.pop();
                    switch(str){
                        case "+" : stack.push(a+b);
                        break;
                        case "-" : stack.push(b-a);
                        break;
                        case "/" : stack.push(b/a);
                        break;
                        case "*" : stack.push(b*a);
                        break;
                    }
                } else if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                    stack.push(Integer.parseInt(str));
                }
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();

    }

    public static void main(String[] args) {
        evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" });
    }
}
