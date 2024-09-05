public class FindMissingObservation {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for (int num : rolls) {
            sum += num;
        }
        int maxVal = mean * (n + rolls.length) - sum;
        if (maxVal < n || maxVal > n * 6) {
            return new int[] {};
        }

        int result[] = new int[n];
        int expValue = maxVal / n, remainder = maxVal % n;
        for (int i = 0; i < remainder; i++) {
            result[i] = expValue + 1;
        }
        for (int i = remainder; i < n; i++) {
            result[i] = expValue;
        }
        return result;
    }
}
