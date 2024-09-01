public class AddDigit {
    public int addDigits(int num) {

        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                int bit = num % 10;
                sum += bit;
                num = num / 10;
            }
            num = sum;
        }

        return num;

    }

    public static void main(String[] args) {

    }
}
