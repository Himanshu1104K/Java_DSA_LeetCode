import java.util.*;

public class ParsingBooleanExp {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();

        for (char exp : expression.toCharArray()) {
            if (exp == ',' || exp == '(') {
                continue;
            }

            if (exp == 't' || exp == 'f' || exp == '!' || exp == '&' || exp == '|') {
                st.push(exp);
            } else if (exp == ')') {
                boolean hasTrue = false, hasFalse = false;
                while (st.peek() != '&' && st.peek() != '|' && st.peek() != '!') {
                    char s = st.pop();
                    if (s == 't')
                        hasTrue = true;
                    if (s == 'f')
                        hasFalse = true;
                }
                char op = st.pop();
                if (op == '!') {
                    st.push(hasTrue ? 'f' : 't');
                } else if (op == '&') {
                    st.push(hasFalse ? 'f' : 't');
                } else {
                    st.push(hasTrue ? 't' : 'f');
                }
            }
        }

        return st.peek() == 't';
    }
}