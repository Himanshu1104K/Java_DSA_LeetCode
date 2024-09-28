
import java.util.*;

public class DesignCircularDeque {

    public static void main(String[] args) {

    }
}

class MyCircularDeque {

    int size;
    Deque<Integer> list;
    int length = 0;

    public MyCircularDeque(int k) {
        this.size = k;
        list = new LinkedList<>();
    }

    public boolean insertFront(int value) {
        if (length < size) {
            list.addFirst(value);
            length++;
            return true;
        }
        return false;
    }

    public boolean insertLast(int value) {
        if (length < size) {
            list.addLast(value);
            length++;
            return true;
        }
        return false;
    }

    public boolean deleteFront() {
        if (length != 0) {
            list.removeFirst();
            length--;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (length != 0) {
            list.removeLast();
            length--;
            return true;
        }
        return false;
    }

    public int getFront() {
        if (length != 0) {
            return list.getFirst();
        }
        return -1;
    }

    public int getRear() {
        if (length != 0) {
            return list.getLast();
        }
        return -1;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k); boolean param_1 =
 * obj.insertFront(value); boolean param_2 = obj.insertLast(value); boolean
 * param_3 = obj.deleteFront(); boolean param_4 = obj.deleteLast(); int param_5
 * = obj.getFront(); int param_6 = obj.getRear(); boolean param_7 =
 * obj.isEmpty(); boolean param_8 = obj.isFull();
 */
