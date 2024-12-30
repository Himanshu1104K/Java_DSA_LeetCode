public class CountTheDigitThatDividesNum {
    public int countDigits(int num) {
        int result = 0;
        int number = num;
        while (num != 0) {
            int bit = num % 10;
            if (number % bit == 0) {
                result++;
            }
            num /= 10;
        }
        return result;
    }
}
