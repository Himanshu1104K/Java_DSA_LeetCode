public class ShifftingLetter2 {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int motion = shift[2] == 1 ? 1 : -1;

            diff[start] += motion;
            diff[end + 1] -= motion;

        }
        int[] newPos = new int[n];
        int curShift = 0;
        for (int i = 0; i < n; i++) {
            curShift += diff[i];
            newPos[i] = curShift;
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newPos[i] = newPos[i] % 26;
            char ch = (char) ((s.charAt(i) - 'a' + newPos[i] + 26) % 26 + 'a');
            str.append(ch);
        }

        return str.toString();
    }
}