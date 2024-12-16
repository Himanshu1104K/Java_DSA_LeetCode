import java.util.*;

public class KidWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candie : candies) {
            max = Math.max(candie, max);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candie : candies) {
            boolean val = (candie + extraCandies >= max);
            result.add(val);
        }
        return result;
    }
}