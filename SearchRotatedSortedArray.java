
public class SearchRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int lb = 0;
        int ub = nums.length - 1;
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[lb] <= nums[mid]) {
                if (target >= nums[lb] && target < nums[mid]) {
                    ub = mid - 1;
                } else {
                    lb = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[ub]) {
                    lb = mid + 1;
                } else {
                    ub = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int result = search(new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8 }, 1);
        System.out.println(result);
    }
}