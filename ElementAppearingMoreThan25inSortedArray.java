public class ElementAppearingMoreThan25inSortedArray {
    public static int findSpecialInteger(int[] arr) {
        int per25 = (int) Math.ceil((0.25 * arr.length));
        int cur = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                cur++;
            } else {
                if (cur > per25) {
                    return arr[i - 1];
                }
                cur = 1;
            }

        }

        if (cur > per25) {
            return arr[arr.length - 1];
        }

        return arr[0];
    }

}
