import java.util.*;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (var path : paths) {
            map.put(path.get(0), path.get(1));
        }
        String destination = "";
        for (String key : map.keySet()) {
            if (!map.containsKey(map.get(key))) {
                destination = map.get(key);
                break;
            }
        }
        return destination;
    }
}
