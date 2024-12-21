public class SortArrayByParityEasy {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                even++;
            }
        }
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[i++] = num;
            } else {
                result[even++] = num;
            }
        }
        return result;
    }
}
