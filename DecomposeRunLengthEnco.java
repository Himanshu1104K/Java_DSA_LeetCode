public class DecomposeRunLengthEnco {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i += 2) {
            n += nums[i];
        }
        int result[] = new int[n];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = i % 2 == 0 ? nums[i] : 0;
            while (count != 0) {
                result[x++] = nums[i];
                count--;
            }

        }
        return result;
    }

    public static void main(String[] args) {

    }
}