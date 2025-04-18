public class MaxCandiesToAllocate {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = 10_000_000;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long childrenCount = 0;

            if (mid != 0) {
                for (int candy : candies) {
                    childrenCount += candy / mid;
                }
            }

            if (childrenCount >= k) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}