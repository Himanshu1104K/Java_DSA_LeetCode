

public class SortedSqaureArr {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i< nums.length ;i++){
            nums[i] = nums[i]*nums[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        
    }
}
