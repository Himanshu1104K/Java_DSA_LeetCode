public class AlternatingGroup1 {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[(i + 1) % n] && colors[(i + 1) % n] != colors[(i + 2) % n]) {
                result++;
            }
        }
        return result;
    }
}
