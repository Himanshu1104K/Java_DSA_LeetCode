public class ContainerWIthMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int curHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(curHeight * (right - left), maxArea);

            while (left < right && height[left] < curHeight) {
                left++;
            }
            while (left < right && height[right] < curHeight) {
                right--;
            }

        }

        return maxArea;
    }
}
