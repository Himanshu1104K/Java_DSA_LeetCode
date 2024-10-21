public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int q = num / 4;
        int start = 1;
        while (start <= q + 1) {
            if (start * start == num) {
                return true;
            }
            start++;
        }
        return false;
    }
}
