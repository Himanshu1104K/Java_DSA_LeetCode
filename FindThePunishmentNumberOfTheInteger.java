public class FindThePunishmentNumberOfTheInteger {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isSame(i, square)) {
                sum += square;
            }
        }
        return sum;
    }

    public boolean isSame(int i, int square) {
        if (square < i || square < 0) {
            return false;
        }

        if (i == square) {
            return true;
        }

        return (isSame(i - (square % 10), square / 10) || (isSame(i - (square % 100), square / 100))
                || (isSame(i - (square % 1000), square / 1000)));
    }
}