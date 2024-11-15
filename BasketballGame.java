import java.util.*;

public class BasketballGame {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        for (String operation : operations) {
            if ("+".equals(operation)) {
                int x = record.getLast();
                int y = record.get(record.size() - 2);
                record.add(x + y);
            } else if ("D".equals(operation)) {
                record.add(record.getLast() * 2);
            } else if ("C".equals(operation)) {
                record.removeLast();
            } else {
                int x = Integer.parseInt(operation);
                record.add(x);
            }
        }
        int result = 0;
        for (int val : record) {
            result += val;
        }
        return result;
    }
}
