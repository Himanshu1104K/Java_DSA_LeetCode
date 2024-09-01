public class MinInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int lb = 0;
        int ub = nums.length - 1;
        if (nums[lb] <= nums[ub]) {
            return nums[lb];
        }
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid] >= nums[lb]) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}