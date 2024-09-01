public class ReverseInt {
    public static int reverse(int x) {
        long res = 0;
        int sign = 1;
        if(x<0){
            sign = -1;
            x = -x;
        }
        while(x>0){
            int bit = x%10;
            res = res*10+ bit;
            if(res >= Integer.MAX_VALUE){
                return 0;
            }
            x = x/10;
        }
        return sign*(int)res;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
