public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;

        boolean isPrime[] = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean isP : isPrime) {
            if (isP)
                count++;
        }

        return count;
    }
}
