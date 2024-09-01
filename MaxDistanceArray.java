import java.util.*;

public class MaxDistanceArray {
    public int maxDistance(List<List<Integer>> arrays) {
        if (arrays.size()==0 || arrays.size() == 1) {
            return 0;
        }
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < arrays.size(); i++) {

            if (min1 > arrays.get(i).get(0)) {
                min1 = arrays.get(i).get(0);
                idx1 = i;
            }

            if (max < arrays.get(i).getLast()) {
                max = arrays.get(i).getLast();
                idx2 = i;
            }

        }
        for (int i = 0; i < arrays.size(); i++) {
            if (i != idx1) {

                if (max1 < arrays.get(i).getLast()) {
                    max1 = arrays.get(i).getLast();
                }

            }
            if (i != idx2) {

                if (min > arrays.get(i).get(0)) {
                    min = arrays.get(i).get(0);
                }

            }
        }

        max = (max - min)>=0? max-min:min-max;
        max1 = (max1 - min1)>=0? max1-min1:min1-max1;

        if (max >= max1) {
            return max;
        } else {
            return max1;
        }
    }

    public static void main(String[] args) {

    }
}