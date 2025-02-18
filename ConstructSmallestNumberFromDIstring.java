public class ConstructSmallestNumberFromDIstring {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] stack = new int[n + 1];
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = 0; i <= n; i++) {
            stack[index++] = i + 1;
            if (i == n || pattern.charAt(i) == 'I') {
                while (index > 0) {
                    result.append(stack[--index]);
                }
            }
        }

        return result.toString();
    }
}