public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        return helperSum(nums, target, 0, 0);
    }

    public int helperSum(int[] nums,int target,int idx , int sum){
        if(idx >= nums.length){
            return sum == target? 1:0;
        }

        int subtract = helperSum(nums,target, idx+1,sum - nums[idx]);
        int add = helperSum(nums,target, idx+1,sum + nums[idx]);
        return subtract + add;
    }
}