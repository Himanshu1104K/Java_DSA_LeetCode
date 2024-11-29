public class CountTestedDevice {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int per : batteryPercentages) {
            if ((per - count) > 0) {
                count++;
            }
        }
        return count;
    }
}
