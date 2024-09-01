import java.util.*;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(list.get(i - 2).get(j-2) + list.get(i - 2).get(j-1));
                }
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        generate(5);
    }
}