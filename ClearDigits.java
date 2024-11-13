public class ClearDigits {
    public String clearDigits(String s) {
        int n = s.length();
        boolean marked[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            char val = s.charAt(i);
            if (val <= '9' && val >= '0') {
                marked[i] = true;
                if (i > 0) {
                    int idx = i;
                    while (idx >= 0 && marked[idx] != false) {
                        idx--;
                    }
                    marked[idx] = true;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (marked[i] != true) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}