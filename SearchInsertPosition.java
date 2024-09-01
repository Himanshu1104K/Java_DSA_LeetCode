public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int si = 0;
        int ei = nums.length - 1;
        int mid = 0;
        while (si <= ei) {
            mid = (int) (si- (si - ei) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        System.out.println(si);
        System.out.println(ei);
        return ei+1;

    }

    public static void main(String[] args) {
        // int out = searchInsert(new int[] { 1, 3, 5, 6 }, 5);
        // System.out.println("2 : " + out);
        int out = searchInsert(new int[] { 1, 3 ,5,6}, 2);
        System.out.println("1 : " + out);
        // out = searchInsert(new int[] { 1, 3, 5, 6 }, 7);
        // System.out.println("4 : " + out);
    }
}