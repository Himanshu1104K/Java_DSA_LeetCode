public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[2 * n];
        int start = 0;
        int mid = n;
        int i = 0;
        while (i < 2 * n) {
            result[i] = nums[start];
            i++;
            start++;
            result[i] = nums[mid];
            i++;
            mid++;
        }
        return result;
    }
}
