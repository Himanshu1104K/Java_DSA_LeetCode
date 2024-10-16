import java.util.*;

public class FindMedianFromDataStream {
    PriorityQueue<Integer> low;
    PriorityQueue<Integer> high;

    public FindMedianFromDataStream() {
        low = new PriorityQueue<>();
        high = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
        low.offer(num);
        
    }

    public double findMedian() {
        int size = low.size();
        double result = 0;
        if (size % 2 != 0) {
            size = size / 2;
            for (int val : low) {
                size--;
                if (size == 0) {
                    result = val;
                    break;
                }
            }
        } else {
            size = size / 2;
            for (int val : low) {
                size--;
                if (size == 1) {
                    result += val;
                }
                if (size == 0) {
                    result += val;
                    break;
                }
            }
            result /= 2;
        }
        return result;
    }

}