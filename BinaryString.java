public class BinaryString {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder res = new StringBuilder();
        char carry = '0';
        while (i >= 0 && j >= 0) {
            if (carry == '0') {
                if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                    res.append('0');
                    carry = '0';
                } else if (a.charAt(i) == '1' && b.charAt(j) == '0') {
                    res.append('1');
                    carry = '0';
                } else if (a.charAt(i) == '0' && b.charAt(j) == '1') {
                    res.append('1');
                    carry = '0';
                } else if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                    res.append('0');
                    carry = '1';
                }
            } else if (carry == '1') {
                if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                    res.append('1');
                    carry = '0';
                } else if (a.charAt(i) == '1' && b.charAt(j) == '0') {
                    res.append('0');
                    carry = '1';
                } else if (a.charAt(i) == '0' && b.charAt(j) == '1') {
                    res.append('0');
                    carry = '1';
                } else if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                    res.append('1');
                    carry = '1';
                }
            }
            i--;
            j--;
        }
        while(i>=0){
            if (a.charAt(i) == '0' && carry == '0') {
                res.append('0');
                carry = '0';
            } else if (a.charAt(i) == '1' && carry == '0') {
                res.append('1');
                carry = '0';
            } else if (a.charAt(i) == '0' && carry == '1') {
                res.append('1');
                carry = '0';
            } else if (a.charAt(i) == '1' && carry == '1') {
                res.append('0');
                carry = '1';
            }
            i--;
        }
        while(j>=0){
            if (b.charAt(j) == '0' && carry == '0') {
                res.append('0');
                carry = '0';
            } else if (b.charAt(j) == '1' && carry == '0') {
                res.append('1');
                carry = '0';
            } else if (b.charAt(j) == '0' && carry == '1') {
                res.append('1');
                carry = '0';
            } else if (b.charAt(j) == '1' && carry == '1') {
                res.append('0');
                carry = '1';
            }
            j--;
        }
        if(carry=='1'){
            res.append('1');
        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
