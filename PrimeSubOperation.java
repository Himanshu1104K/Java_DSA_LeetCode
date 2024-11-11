public class PrimeSubOperation {
    public static boolean primeSubOperation(int[] nums) {
        int max = -1;
        for (int num : nums) {
            max = Math.max(num, max);
        }

        boolean[] sieve = new boolean[max + 1];
        sieve[1] = true;

        // Seive[i] = true -> not a prime number
        // Seive[i] = false -> a prime number

        for (int i = 2; i < max + 1; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j <= max; j += i) {
                    sieve[j] = true;
                }
            }
        }

        int curValue = 1;
        int i = 0;
        while (i < nums.length) {
            int diff = nums[i] - curValue;

            if (diff < 0) {
                return false;
            }

            if (diff == 0 || sieve[diff] == false) {
                i++;
            }
            curValue++;
        }

        return true;
    }

    public static void main(String[] args) {
        primeSubOperation(new int[] { 4, 9, 6, 10 });
    }
}