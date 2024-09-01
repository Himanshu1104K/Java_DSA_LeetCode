public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        if (columnTitle.equals("")) {
            return 0;
        }
        int out = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            out = 26 * out + (int) (columnTitle.charAt(i) - 'A' + 1);
        }
        return out;
    }
}
