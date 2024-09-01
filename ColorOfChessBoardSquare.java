public class ColorOfChessBoardSquare {
    public static boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = coordinates.charAt(1) - '0';
        if (x % 2 == 0 && y % 2 == 0) {
            return false;
        } else if (x % 2 != 0 && y % 2 == 0) {
            return true;
        } else if (x % 2 != 0 && y % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        squareIsWhite("a2");
    }
}
