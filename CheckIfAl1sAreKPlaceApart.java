public class CheckIfAl1sAreKPlaceApart {
    public static boolean kLengthApart(int[] nums, int k) {
        int sep = 0;
        int i = 0;
        while (nums[i] != 1) {
            i++;
        }
        i++;
        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                sep++;
            } else {
                if (sep < k) {
                    return false;
                }
                sep = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        kLengthApart(new int[] { 1, 0, 0, 0, 1, 0, 0, 1 }, 2);
    }
}