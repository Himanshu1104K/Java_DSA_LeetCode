import java.util.*;

public class DisplayTableOfFoodOrdersInRestaurant {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> tableMap = new TreeMap<>();
        Set<String> food = new TreeSet<>();

        for (List<String> order : orders) {
            int tableNum = Integer.parseInt(order.get(1));
            String foodItem = order.get(2);
            tableMap.putIfAbsent(tableNum, new HashMap<>());
            food.add(foodItem);
            tableMap.get(tableNum).put(foodItem, tableMap.get(tableNum).getOrDefault(foodItem, 0) + 1);
        }

        List<List<String>> result = new ArrayList<>();
        List<String> header = new ArrayList<>();
        header.add("Table");
        header.addAll(food);
        result.add(header);

        for (int table : tableMap.keySet()) {
            List<String> row = new ArrayList<>();
            row.add(Integer.toString(table));
            Map<String, Integer> temp = tableMap.get(table);
            for (String f : food) {
                row.add(Integer.toString(temp.getOrDefault(f, 0)));
            }
            result.add(row);
        }

        return result;
    }
}
