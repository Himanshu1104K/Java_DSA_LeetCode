public class TwoSneakyNoOfDIgitVille {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }

        int[] result = new int[2];
        int idx = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > 1) {
                result[idx++] = i;
            }
        }
        return result;
    }
}