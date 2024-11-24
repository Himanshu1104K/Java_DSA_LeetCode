import java.util.*;

public class SnakeinMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String command : commands) {
            if ("LEFT".equals(command)) {
                i--;
            } else if ("RIGHT".equals(command)) {
                i++;
            } else if ("UP".equals(command)) {
                j--;
            } else {
                j++;
            }
        }
        return n * j + i - 1;
    }
}