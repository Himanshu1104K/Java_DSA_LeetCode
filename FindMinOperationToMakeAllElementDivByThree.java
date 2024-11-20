public class FindMinOperationToMakeAllElementDivByThree {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int x = num % 3;
            int y = (num + 1) % 3;
            int z = (num + 2) % 3;
            result += Math.min(Math.min(x, y), z);
        }
        return result;
    }
}