public class SignOfProductOfArray {
    public int arraySign(int[] nums) {
        int bit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }

            if (nums[i] < 0) {
                bit++;
            }
        }

        if (bit % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
