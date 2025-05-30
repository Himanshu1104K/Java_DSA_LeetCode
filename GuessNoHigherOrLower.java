public class GuessNoHigherOrLower {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int num = (mid);
            if (num == 0) {
                return mid;
            } else if (num == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}