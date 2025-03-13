public class GenerateAStringWithOddNumberOfCount {
    public String generateTheString(int n) {
        String ch = "a";
        StringBuilder str = new StringBuilder();
        while (n != 0) {
            if (n % 2 == 0) {
                str.append(ch.repeat(n - 1));
                n = 1;
                ch = Character.toString(str.charAt(0) + 1);
            } else {
                str.append(ch.repeat(n));
                break;
            }
        }
        return str.toString();
    }
}
