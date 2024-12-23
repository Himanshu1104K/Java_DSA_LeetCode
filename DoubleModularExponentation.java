import java.util.*;

public class DoubleModularExponentation {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        for (int[] variable : variables) {
            int a = variable[0];
            int b = variable[1];
            int c = variable[2];
            int m = variable[3];
            int fResult = 1;
            for (int j = 0; j < b; j++) {
                fResult = (fResult * a) % 10;
            }
            int finalResult = 1;
            for (int j = 0; j < c; j++) {
                finalResult = (finalResult * fResult) % m;
            }
            if (target == finalResult) {
                result.add(i);
            }
            i++;
        }

        return result;
    }
}
