public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxRel = 0;
        int idx = -1;
        for (int i = releaseTimes.length - 1; i >= 0; i--) {
            if (i > 0) {
                releaseTimes[i] -= releaseTimes[i - 1];
            }
            if (maxRel < releaseTimes[i]) {
                maxRel = releaseTimes[i];
                idx = i;
            } else if (maxRel == releaseTimes[i] && keysPressed.charAt(i) > keysPressed.charAt(idx)) {
                maxRel = releaseTimes[i];
                idx = i;
            }
        }
        return keysPressed.charAt(idx);
    }
}