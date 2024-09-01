
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SpiralMatrix4 {
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        if (m == n && m == 1) {
            result[0][0] = head == null ? -1 : head.val;
        }
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], -1);
        }
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (head != null) {
            // Top left - > right
            for (int i = left; i <= right && head != null; i++) {
                result[top][i] = head.val;
                head = head.next;
            }
            top++;

            // Top right - > Bottom right
            for (int i = top; i <= bottom && head != null; i++) {
                result[i][right] = head.val;
                head = head.next;
            }
            right--;

            // Bottom Right - > Bottom left
            if (top <= bottom) {
                for (int i = right; i >= left && head != null; i--) {
                    result[bottom][i] = head.val;
                    head = head.next;
                }
                bottom--;
            }

            // Bottom left - > Top left
            if (left <= right) {
                for (int i = bottom; i >= top && head != null; i--) {
                    result[i][left] = head.val;
                    head = head.next;
                }
                left++;
            }
        }
        return result;
    }
}
