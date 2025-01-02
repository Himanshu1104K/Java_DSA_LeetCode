public class NumberOfLazerBeamsInBank {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int prev = 0;
        for (String floor : bank) {
            int val = 0;
            for (char ch : floor.toCharArray()) {
                if (ch == '1') {
                    val++;
                }
            }
            result += val * prev;
            if (val != 0) {
                prev = val;
            }

        }
        return result;
    }
}
