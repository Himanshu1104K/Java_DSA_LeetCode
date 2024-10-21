public class SortColor {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int num : nums) {
            colors[num]++;
        }
        int idx = 0;
        for (int i = 0; i < colors[0]; i++) {
            nums[idx++] = 0;
        }
        for (int i = 0; i < colors[1]; i++) {
            nums[idx++] = 1;
        }
        for (int i = 0; i < colors[2]; i++) {
            nums[idx++] = 2;
        }
    }
}
