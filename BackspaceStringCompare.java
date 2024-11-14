public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        int sLength = s.length();
        boolean sArr[] = new boolean[sLength];
        for (int i = 0; i < sLength; i++) {
            char val = s.charAt(i);
            if (val == '#') {
                sArr[i] = true;
                if (i > 0) {
                    int idx = i;
                    while (i >= 0 && sArr[idx] != false) {
                        idx--;
                    }
                    sArr[idx] = true;
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < sLength; i++) {
            if (!sArr[i]) {
                str.append(s.charAt(i));
            }
        }

        int tLength = t.length();
        boolean tArr[] = new boolean[tLength];
        for (int i = 0; i < tLength; i++) {
            char val = t.charAt(i);
            if (val == '#') {
                tArr[i] = true;
                if (i > 0) {
                    int idx = i;
                    while (i >= 0 && tArr[idx] != false) {
                        idx--;
                    }
                    tArr[idx] = true;
                }
            }
        }
        StringBuilder ttr = new StringBuilder();
        for (int i = 0; i < tLength; i++) {
            if (!tArr[i]) {
                ttr.append(t.charAt(i));
            }
        }

        return str.compareTo(ttr) == 0;
    }
}