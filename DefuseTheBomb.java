public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int result[] = new int[n];
        if (k == 0) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i + n - j) % code.length];
                }
            }
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] code = decrypt(new int[] { 2, 4, 9, 3 }, -2);
        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i] + " ");
        }
    }
}
