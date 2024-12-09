import java.util.*;

public class LargestNumBySwapingDigitByParity {
    public int largestInteger(int num) {
        String s = String.valueOf(num);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        int evenIdx = 0, oddIdx = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0) {
                result.append(even.get(evenIdx++));
            } else {
                result.append(odd.get(oddIdx++));
            }
        }

        return Integer.parseInt(result.toString());
    }
}
