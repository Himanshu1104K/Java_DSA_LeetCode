public class ThreeDivisior {
    public boolean isThree(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }
            if (result > 3) {
                return false;
            }
        }
        return result == 3;
    }
}
