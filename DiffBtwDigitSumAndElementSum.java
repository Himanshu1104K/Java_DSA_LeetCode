public class DiffBtwDigitSumAndElementSum {
    public int differenceOfSum(int[] nums) {
        int digitSum = 0;
        int elementSum = 0;
        for (int num : nums) {
            elementSum += num;

            while (num > 0) {
                digitSum += num % 10;
                num = num / 10;
            }

        }
        return Math.abs(digitSum - elementSum);
    }
}
