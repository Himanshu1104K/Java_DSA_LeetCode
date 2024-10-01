public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0, i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                res = res - 1;
            } else if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                res = res - 10;
            } else if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                res = res - 100;
            } else if (s.charAt(i) == 'I') {
                res = res + 1;
            } else if (s.charAt(i) == 'V') {
                res = res + 5;
            } else if (s.charAt(i) == 'X') {
                res = res + 10;
            } else if (s.charAt(i) == 'L') {
                res = res + 50;
            } else if (s.charAt(i) == 'C') {
                res = res + 100;
            } else if (s.charAt(i) == 'D') {
                res = res + 500;
            } else if (s.charAt(i) == 'M') {
                res = res + 1000;
            }
        }
        if (s.charAt(i) == 'I') {
            res = res + 1;
        } else if (s.charAt(i) == 'V') {
            res = res + 5;
        } else if (s.charAt(i) == 'X') {
            res = res + 10;
        } else if (s.charAt(i) == 'L') {
            res = res + 50;
        } else if (s.charAt(i) == 'C') {
            res = res + 100;
        } else if (s.charAt(i) == 'D') {
            res = res + 500;
        } else if (s.charAt(i) == 'M') {
            res = res + 1000;
        }
        return res;
    }
}