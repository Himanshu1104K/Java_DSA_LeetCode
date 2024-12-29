public class SumOfTwoNumber {
    public int getSum(int a, int b) {
        while (b != 0) {
            // Calculate carry using AND operation
            int carry = a & b;
            // Calculate sum without considering carry using XOR operation
            a = a ^ b;
            // Shift carry to the left by 1 to add in the next iteration
            b = carry << 1;
        }
        return a;
    }
}