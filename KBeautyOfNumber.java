public class KBeautyOfNumber {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int res = 0;
        for (int i = 0; i < str.length() - k + 1; i++) {
            int bit = Integer.parseInt(str.substring(i, i + k));
            if (bit != 0 && num % bit == 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
