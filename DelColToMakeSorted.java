
public class DelColToMakeSorted {
    public int minDeletionSize(String[] strs) {
        if (strs.length == 0) {
            return 0;
        }
        int i = 0;
        int sortCount = 0;
        int n = strs.length;
        int m = strs[0].length();
        while (i < m) {
            int prevCharVal = 0;
            int j = 0;
            while (j < n) {
                var curStr = strs[j];
                var c = curStr.charAt(i);
                if (c < prevCharVal) {
                    sortCount++;
                    break;
                }
                prevCharVal = c;
                j++;
            }
            i++;
        }
        return sortCount;
    }

    public static void main(String[] args) {

    }
}
