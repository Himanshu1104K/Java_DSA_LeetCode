
import java.util.Arrays;

public class MinimumTimeToRepairCars {
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = (long) Arrays.stream(ranks).min().getAsInt() * cars * cars;

        while (left < right) {
            long mid = (left + right) / 2;
            if (canRepairCar(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean canRepairCar(int[] ranks, int cars, long time) {
        long totalRepairedCars = 0;
        for (int rank : ranks) {
            totalRepairedCars += Math.sqrt(time / rank);
            if (totalRepairedCars >= cars)
                return true;
        }
        return false;
    }
}
