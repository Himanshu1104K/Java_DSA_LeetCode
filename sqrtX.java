public class sqrtX {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long mid_sqrd = (long) mid * mid;
            if (mid_sqrd == x) {
                return mid;
            } else if (mid_sqrd > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}