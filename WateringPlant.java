public class WateringPlant {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int curCap = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (curCap >= plants[i]) {
                steps++;
                curCap -= plants[i];
            } else {
                steps += (i * 2);
                curCap = capacity;
                i--;
            }
        }
        return steps;
    }
}
