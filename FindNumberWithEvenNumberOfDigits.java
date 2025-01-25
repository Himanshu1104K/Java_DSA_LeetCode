public class FindNumberWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            String number = Integer.toString(num);
            if (number.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
