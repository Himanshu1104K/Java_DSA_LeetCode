
public class MultiplyString {

    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] res = new int[num1.length() + num2.length()];
        // while (l1 >= 0) {
        //     index = num1.length() - 1 - l1;
        //     System.out.println("Index : " + index);
        //     l2 = num2.length() - 1;
        //     while (l2 >= 0) {
        //         res[index] = ((num1.charAt(l1) - '0') * (num2.charAt(l2) - '0') + res[index]) % 10;
        //         System.out.println("res index : " + res[index]);
        //         res[index + 1] = ((num1.charAt(l1) - '0') * (num2.charAt(l2) - '0') + res[index]) / 10;
        //         System.out.println("res index + 1 : " + res[index + 1]);
        //         index++;
        //         l2--;
        //     }
        //     l1--;
        // }

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder nStr = new StringBuilder("");
        int i = 0;
        for (; i < res.length; i++) {
            if (res[i] == 0) {
            } else {
                break;
            }
        }
        for (; i < res.length; i++) {
            nStr.append(Integer.toString(res[i]));
        }
        return nStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
}
