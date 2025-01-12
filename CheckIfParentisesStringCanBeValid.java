import java.util.*;

public class CheckIfParentisesStringCanBeValid {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        Stack<Integer> openIdx = new Stack<>();
        Stack<Integer> unLockedIdx = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                unLockedIdx.push(i);
            } else if (s.charAt(i) == '(') {
                openIdx.push(i);
            } else {
                if (!openIdx.isEmpty()) {
                    openIdx.pop();
                } else if (!unLockedIdx.isEmpty()) {
                    unLockedIdx.pop();
                } else {
                    return false;
                }
            }
        }
        while (!openIdx.isEmpty() && !unLockedIdx.isEmpty() && openIdx.peek() < unLockedIdx.peek()) {
            openIdx.pop();
            unLockedIdx.pop();
        }

        if (openIdx.isEmpty() && !unLockedIdx.isEmpty()) {
            return unLockedIdx.size() % 2 == 0;
        }

        return openIdx.isEmpty();
    }
}