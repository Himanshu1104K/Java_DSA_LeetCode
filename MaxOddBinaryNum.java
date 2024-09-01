
public class MaxOddBinaryNum {
    public static String maximumOddBinaryNumber(String s) {
        int count = 0;
        char[] str = s.toCharArray();
        for(char ch : str){
            if(ch=='1') count++;
        }
        if(count==0){
            return s;
        }
        for(int i = 0 ; i < count-1 ; i++){
            str[i] = '1';
        }
        for(int i = count-1;i<str.length-1;i++){
            str[i] = '0';
        }
        str[str.length-1] = '1';
        return new String(str);
    }

    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("10001111001"));
    }
}
