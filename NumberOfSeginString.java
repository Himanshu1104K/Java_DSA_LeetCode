public class NumberOfSeginString {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (String str : s.split(" ")) {
            if (!"".equals(str)) {
                result++;
            }
        }

        return result;
    }
}
