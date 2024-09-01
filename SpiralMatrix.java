import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right ) {
            // Top left - > right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Top right - > Bottom right
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Bottom Right - > Bottom left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom left - > Top left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
// while (top <= bottom && left <= right) {
// int prevLeft = left;
// int prevRight = right;
// int prevTop = top;
// int prevbottom = bottom;

// // Top left - > right
// while (left <= right) {
// result.add(matrix[top][left]);
// left++;
// }
// left = prevLeft;
// top++;

// // Top right - > Bottom right
// while (top <= bottom) {
// result.add(matrix[top][right]);
// top++;
// }
// top = prevTop;
// right--;

// // Bottom Right - > Bottom left
// if (top <= bottom) {
// while (right >= left) {
// result.add(matrix[bottom][right]);
// right--;
// }
// right = prevRight;
// bottom--;
// }

// // Bottom left - > Top left
// if (left <= right) {
// while (bottom >= top) {
// result.add(matrix[bottom][left]);
// bottom--;
// }
// bottom = prevbottom;
// }

// top++;
// bottom--;
// left++;
// right--;
// }