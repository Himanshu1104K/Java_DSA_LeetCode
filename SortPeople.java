
public class SortPeople {

    public static String[] sortPeople(String[] names, int[] heights) {

        for (int j = 0; j < heights.length; j++) {
            int idx = j;
            for (int i = j + 1; i < heights.length; i++) {
                if (heights[idx] < heights[i]) {
                    idx = i;
                }
            }
            if (idx != j) {
                int temp = heights[j];
                heights[j] = heights[idx];
                heights[idx] = temp;
                String tem = names[j];
                names[j] = names[idx];
                names[idx] = tem;
            }

        }

        return names;
    }

    public static void main(String[] args) {

    }
}
