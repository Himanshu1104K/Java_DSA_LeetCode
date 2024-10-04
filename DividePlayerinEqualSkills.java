public class DividePlayerinEqualSkills {
    public long dividePlayers(int[] skill) {
        int skillFreq[] = new int[1001];
        int totalSum = 0;
        int n = skill.length;
        for (int s : skill) {
            skillFreq[s]++;
            totalSum += s;
        }
        if (totalSum % (n / 2) != 0) {
            return -1;
        }
        long Chemistry = 0;
        int perTeamSkill = totalSum / (n / 2);
        for (int s : skill) {
            int perVal = perTeamSkill - s;
            if (skillFreq[perVal] == 0) {
                return -1;
            }

            Chemistry += (long) s * (long) perVal;
            skillFreq[perVal]--;
        }
        return Chemistry / 2;
    }
}