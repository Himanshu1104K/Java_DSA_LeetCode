public class FindTheBallAfterKSec {
    public static int numberOfChild(int n, int k) {
        int result = 0;
        int operation = 0;
        while (k != 0) {
            if (result == n - 1) {
                operation = 1;
            }
            if (result == 0) {
                operation = 0;
            }
            switch (operation) {
                case 0 -> result++;
                case 1 -> result--;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        numberOfChild(3, 5);
    }
}