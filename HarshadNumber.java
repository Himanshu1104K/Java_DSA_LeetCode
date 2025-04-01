public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digitSum = 0;
        int num = x;
        while (num > 0) {
            int digit = num % 10;
            digitSum += digit;
            num /= 10;
        }
        return x % digitSum == 0 ? digitSum : -1;
    }
}
