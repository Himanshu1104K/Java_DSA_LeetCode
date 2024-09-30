
import java.util.*;

public class PascalTriangle2 {

    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= rowIndex + 1; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(list.get(i - 2).get(j - 2) + list.get(i - 2).get(j - 1));
                }
            }
            list.add(temp);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        generate(5);
    }
}
