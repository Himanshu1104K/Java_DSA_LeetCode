public class ClimbingStairs{
    public static int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int prev2 = 1;
        int prev1 = 1;
        int fin = 0;
        for(int i = 2;i<=n;i++){
            fin = prev1 + prev2;
            prev2 = prev1;
            prev1 = fin;
        }

        return fin;
    }
    public static void main(String[] args) {
        int n = climbStairs(45);
        System.out.println(n);
    }
}