public class CheckIfNumberCanBeRepresenetedInTheSumOfPowerOf3 {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            int bit = n % 3;
            if (bit == 2) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }
}