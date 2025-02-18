public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = command.length();
        while (i < n) {
            if (command.charAt(i) == 'G') {
                result.append('G');
                i++;
            } else if (i + 1 < n && command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
            } else {
                result.append("al");
                i += 4;
            }
        }
        return result.toString();
    }
}
