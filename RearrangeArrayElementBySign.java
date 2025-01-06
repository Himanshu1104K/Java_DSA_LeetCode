public class RearrangeArrayElementBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int x = 0;
        int y = 0;
        for (int num : nums) {
            if (num < 0) {
                neg[y++] = num;
            } else {
                pos[x++] = num;
            }
        }
        x = y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = pos[x++];
            } else {
                nums[i] = neg[y++];
            }
        }

        return nums;
    }
}
