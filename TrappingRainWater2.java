
public class TrappingRainWater2 {

    public int trapRainWater(int[][] heightMap) {
        // int n = height.length;
        // int left[] = new int[n];
        // int right[] = new int[n];

        // left[0] = height[0];
        // right[n - 1] = height[n - 1];

        // for (int i = 1; i < n; i++) {
        //     left[i] = Math.max(height[i], left[i - 1]);
        // }

        // for (int i = n - 2; i >= 0; i++) {
        //     right[i] = Math.max(height[i], right[i + 1]);
        // }

        // int result = 0;

        // for (int i = 0; i < n; i++) {
        //     result += (Math.min(left[i], right[i]) - height[i]);
        // }

        int m = heightMap.length;
        int n = heightMap[0].length;
        int left[][] = new int[m][n];
        int right[][] = new int[m][n];
        return 0;
    }
}
