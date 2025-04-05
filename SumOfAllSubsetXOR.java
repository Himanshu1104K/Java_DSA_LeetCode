public class SumOfAllSubsetXOR {
    public int subsetXORSum(int[] nums) {
        int orAll = 0;
        for (int num : nums) {
            orAll |= num;
        }

        int multi = 1 << (nums.length - 1);
        return orAll * multi;
    }
}