

public class CustomStack {

    int stack[];
    int top = -1;
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public void push(int x) {
        if (top < maxSize - 1) {
            top++;
            stack[top] = x;
        }
    }

    public int pop() {
        // return top == -1 ? top : stack[top--];
        if (top >= 0) {
            int element = stack[top];
            stack[top] = 0;
            top--;
            return element;
        }
        return -1;
    }

    public void increment(int k, int val) {
        if (k > top) {
            k = top;
        }

        for (int i = 0; i < k; i++) {
            stack[i] += val;
        }
    }
}
