
public class DivBybit {

    static int evenlyDivides(int N) {
        // code here
        int n = N;
        int count = 0;
        while (N > 0) {
            int bit = N % 10;
            if(bit!=0){
                if ((int) n / bit == (float) n / bit ) {
                    count++;
                }
            }
            N = N / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(24046));
    }
}
