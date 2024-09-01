public class RegExpMatching {
    public static boolean isMatch(String s, String p) {
        if(p.isEmpty()){
            return s.isEmpty();
        }

        boolean firstMatch = (!s.isEmpty() && (p.charAt(0)==s.charAt(0)||p.charAt(0)=='.'));

        return true;
    }
    // public static boolean isMatch(String s, String p) {
    //     if (p.equals(".*") && s.length() >= 0) {
    //         return true;
    //     } else if (p.equals("*") && s.length() == 0) {
    //         return true;
    //     } else if (p.equals(".") && s.length() == 1) {
    //         return true;
    //     } else if (p.equals("*")) {
    //         return false;
    //     }

    //     int i = 0;
    //     int j = 0;
    //     char temp = ' ';
    //     while (i < p.length() && j < s.length()) {

    //         if ((i + 1) < p.length()
    //                 && ((s.charAt(j) != p.charAt(i) && p.charAt(i) != '.') && p.charAt(i + 1) == '*')) {
    //             i = i + 2;
    //         } else if (p.charAt(i) == s.charAt(j) || p.charAt(i) == '.') {
    //             i++;
    //             j++;
    //         } else if (p.charAt(i) == '*') {
    //             if (p.charAt(i - 1) == '.') {
    //                 temp = s.charAt(j);
    //             } else {
    //                 temp = p.charAt(i - 1);
    //             }
    //             System.out.println(temp);
    //             while (j < s.length() && temp == s.charAt(j)) {
    //                 j++;
    //             }
    //             i++;
    //             while (i < p.length() && (p.charAt(i) == temp)) {
    //                 i++;
    //             }
    //         } else {
    //             return false;
    //         }
    //     }
    //     while (i < p.length()) {
    //         if ((i + 1) < p.length() && (temp != p.charAt(i) && p.charAt(i + 1) == '*')) {
    //             i = i + 2;
    //         } else {
    //             break;
    //         }
    //     }
    //     if (i < p.length() && temp == p.charAt(i)) {
    //         i++;
    //     }

    //     return (j == s.length()) && (i == p.length());
    // }

    public static void main(String[] args) {
        System.out.println(isMatch("bbbba", ".*a*a"));
    }
}