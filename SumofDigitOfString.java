public class SumofDigitOfString {
    public int getLucky(String s, int k) {
        int result = 0;
        for (char ch : s.toCharArray()) {
            int chValue = ch - 'a' + 1;
            if (chValue >= 10) {
                result += chValue % 10;
                chValue = chValue / 10;
            }
            result += chValue;
        }
        k--;
        while (k != 0) {
            int curRes = result;
            result = 0;
            while (curRes != 0) {
                int bit = curRes % 10;
                result += bit;
                curRes = curRes / 10;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}