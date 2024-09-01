import java.util.*;

public class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        if (n == 1) {
            result[0][0] = 1;
            return result;
        }
        int top = 0, bottom = (n - 1);
        int left = 0, right = n - 1;
        int idx = 1;
        while (top <= bottom) {
            int prevLeft = left;
            int prevRight = right;
            int prevTop = top;
            int prevbottom = bottom;
            while (left <= right) {
                result[top][left] = idx++;
                left++;
            }
            left = prevLeft;
            top++;
            while (top <= bottom) {
                result[top][right] = idx++;
                top++;
            }
            top = prevTop;
            right--;
            while (right > left) {
                result[bottom][right] = idx++;
                right--;
            }
            right = prevRight;

            while (bottom > top) {
                result[bottom][left] = idx++;
                bottom--;
            }
            bottom = prevbottom;
            top++;
            bottom--;
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        List<int[]> out = Arrays.asList(generateMatrix(5));
        System.out.println(out);
    }
}
