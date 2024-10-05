public class BitWIseAndofNoRange {
    public int rangeBitwiseAnd(int left, int right) {
        int count = 0;
        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            count++;
        }
        int result = (left & right) << count;
        return result;
    }
}
