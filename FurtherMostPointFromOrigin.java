public class FurtherMostPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int result = 0;
        int underCount = 0;
        for (char move : moves.toCharArray()) {
            if (move == 'L') {
                result--;
            } else if (move == 'R') {
                result++;
            } else {
                underCount++;
            }
        }

        result = Math.abs(result) + underCount;
        return result;
    }
}
