public class FindIfArrayCanSorted {
    public boolean canSortArray(int[] nums) {
        int prevSetMax = 0;
        int curMax = 0, curMin = 0;
        int prevBitCount = 0;
        for (int value : nums) {
            int curBitCount = Integer.bitCount(value);
            if (curBitCount == prevBitCount) {
                curMax = Math.max(curMax, value);
                curMin = Math.min(curMin, value);
            } else {
                if (curMin < prevSetMax) {
                    return false;
                }

                prevSetMax = curMax;
                curMin = curMax = value;
                prevBitCount = curBitCount;

            }
        }
        return curMin >= prevSetMax;
    }
}
