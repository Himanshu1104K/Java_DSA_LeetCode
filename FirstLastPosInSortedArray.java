public class FirstLastPosInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };
        if (nums.length == 0 || target > nums[nums.length - 1]) {
            return result;
        }
        int lb = 0;
        int ub = nums.length - 1;
        while (lb <= ub) {
            int mid = (int) (lb + ub) / 2;
            if (nums[mid] == target) {
                int pos = mid;
                if ((mid - 1) >= 0 && nums[mid - 1] == target) {
                    while ((mid - 1) >= 0 && nums[mid - 1] == target) {
                        mid--;
                    }

                }
                result[0] = mid;
                mid = pos;
                if ((mid + 1) < nums.length && nums[mid + 1] == target) {
                    while ((mid + 1) < nums.length && nums[mid + 1] == target) {
                        mid++;
                    }
                }
                result[1] = mid;
                break;
            } else if (nums[mid] > target) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);
    }
}
