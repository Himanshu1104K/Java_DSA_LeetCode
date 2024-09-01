public class ExcelSheetTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while (columnNumber != 0) {
            char a;
            if (columnNumber <= 26) {
                a = (char) ('A' + columnNumber - 1);
                str.append(a);
                break;
            }
            if (columnNumber % 26 == 0) {
                a = (char) ('A' + 26 - 1);
                columnNumber -=26;
            } else {
                a = (char) ('A' + columnNumber % 26 - 1);
            }
            str.append(a);
            int mod = columnNumber % 26;
            columnNumber = (columnNumber - mod) / 26;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        // int a = (2147483647- 2147483647%26)/26;
        // System.out.println(a);
        System.out.println("AZ : " + convertToTitle(52));
        System.out.println("AB : " + convertToTitle(28));
        System.out.println("FXSHRXW : " + convertToTitle(2147483647));
        System.out.println("ZY : " + convertToTitle(701));
    }
}