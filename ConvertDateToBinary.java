public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        StringBuilder result = new StringBuilder();

        for (String value : date.split("-")) {
            int val = Integer.parseInt(value);
            result.append(Integer.toBinaryString(val)).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
