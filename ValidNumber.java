public class ValidNumber {
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        } else if (s.length() == 1 && !(s.charAt(0) - 48 >= 0 && s.charAt(0) - 48 <= 9)) {
            return false;
        }

        s = s.trim();

        boolean hasDigit = false;
        boolean hasExpo = false;
        boolean hasDot = false;
        boolean hasSign = true;

        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            s = s.substring(1);
        }

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else if (ch == '.') {
                if (hasExpo || hasDot) {
                    return false;
                }

                hasDot = true;
            } else if (ch == 'e' || ch == 'E') {
                if (hasExpo || !hasDigit) {
                    return false;
                }
                hasDigit = false;
                hasExpo = true;
                hasSign = false;
            } else if (ch == '+' || ch == '-') {
                if ( hasDigit || hasSign) {
                    return false;
                }
                hasSign = true;
            } else {
                return false;
            }

        }
        return hasDigit;

    }

    public static void main(String[] args) {
        // For example, all the following are valid numbers: "2", "0089", "-0.1",
        // "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93",
        // "-123.456e789", while the following are not valid numbers: "abc", "1a", "1e",
        // "e3", "99e2.5", "--6", "-+3", "95a54e53".
        System.out.println(isNumber(".-4"));
        System.out.println(isNumber("32.e-80123"));
    }
}

// int arr[] = new int[4];
// arr[0] = s.charAt(0) == '.' ? 1 : 0;
// arr[1] = s.charAt(0) == '+' ? 1 : 0;
// arr[2] = s.charAt(0) == '-' ? 1 : 0;
// if (arr[0] == 1 || arr[1] == 1 || arr[2] == 1) {
// s = s.substring(1);
// }
// for (char ch : s.toCharArray()) {
// if (!(ch - 48 >= 0 && ch - 48 <= 9) || ch != '+' || ch != '-' || ch != '.' ||
// ch != 'e' || ch != 'E') {
// return false;
// } else if ((ch == '+' || ch == '-') && arr[3] != 1) {
// return false;
// } else if (arr[0] > 1 || arr[1] > 2 || arr[2] > 2 || arr[3] > 1) {
// return false;
// }
// switch (ch) {
// case '.' -> arr[0]++;
// case 'e' -> arr[3]++;
// case 'E' -> arr[3]++;
// case '+' -> arr[1]++;
// case '-' -> arr[2]++;
// }
// }
// return true;