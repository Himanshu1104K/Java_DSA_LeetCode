public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        int result = 0;
        while (n >= k) {
            result += n / k;
            n = n / k;
        }
        result += n;
        return result;
    }
}