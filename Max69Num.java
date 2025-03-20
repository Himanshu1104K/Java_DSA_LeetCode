public class Max69Num {
    public int maximum69Number(int num) {
        String max = Integer.toString(num);
        int n = max.length();
        for (int i = 0; i < n; i++) {
            if (max.charAt(i) == '6') {
                max = max.substring(0, i) + "9" + max.substring(i + 1, n);
            }
        }

        return Integer.parseInt(max);
    }
}
