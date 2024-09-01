import java.util.*;

public class FractionAddSubtraction {
    public static String fractionAddition(String expression) {
        List<String> st = Arrays.asList(expression.split("\\+"));
        int num = 0;
        int den = 1;
        int prevden = den;
        for (String str : st) {
            String arr[] = str.split("/");
            den *= Integer.parseInt(arr[1]);
            num += Integer.parseInt(arr[0]);
        }
        String result = Integer.toString(num) + "/" + Integer.toString(den);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        fractionAddition("-1/2+1/2+1/3");
    }
}