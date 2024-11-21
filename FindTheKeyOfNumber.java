public class FindTheKeyOfNumber {
    public int generateKey(int num1, int num2, int num3) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int x = num1 % 10;
            int y = num2 % 10;
            int z = num3 % 10;

            result = Math.min(Math.min(x, y), z) * (int) Math.pow(10, i + 1) + result;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return result;
    }
}
