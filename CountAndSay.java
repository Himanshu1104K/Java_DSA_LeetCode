
public class CountAndSay {
    public static String countAndSay(int n) {
        StringBuilder str =new StringBuilder("1") ;
        for (int j = 2; j <= n; j++) {
            StringBuilder temp = new StringBuilder(str);
            int count = 0;
            str.setLength(0);
            for (int i = 0; i < temp.length(); i++) {
                count++;
                if(i==temp.length()-1 || temp.charAt(i)!=temp.charAt(i+1)){
                    str.append(count).append(temp.charAt(i));
                    count=0;
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        countAndSay(4);
    }
}