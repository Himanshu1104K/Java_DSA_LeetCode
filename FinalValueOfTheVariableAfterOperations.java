public class FinalValueOfTheVariableAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String ope : operations) {
            if (ope.equals("++X") || ope.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}