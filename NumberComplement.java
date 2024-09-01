public class NumberComplement {
    public static int findComplement(int num) {
        if (num == 1 || num == 0) {
            return num ^ 1;
        }

        int result = 0;
        int i = 0;
        while (num != 0) {
            int bit = num & 1;
            result = result | ((bit ^ 1) << i);
            num = num >> 1;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(2));
    }
}