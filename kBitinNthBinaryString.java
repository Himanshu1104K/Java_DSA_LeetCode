
public class kBitinNthBinaryString {
    public char findKthBit(int n, int k) {
        StringBuilder Sn = new StringBuilder();
        Sn.append("0");
        for (int i = 2; i <= n; i++) {
            StringBuilder Sn1 = new StringBuilder(Sn);
            for (int j = 0; j < Sn1.length(); j++) {
                if (Sn1.charAt(j) == '0') {
                    Sn1.setCharAt(j, '1');
                } else {
                    Sn1.setCharAt(j, '0');
                }
            }

            Sn = new StringBuilder(Sn.append("1").append(Sn1.reverse()));
        }
        return Sn.charAt(k-1);
    }
}