
public class fibnonacci {
    public static int fib(int n,int[] dp){
        if(n==0) return 0;
        if(n == 1) return 1;
        if(dp[n] != 0 ){
            return dp[n];
        }
        return dp[n] = fib(n-1,dp) + fib(n-2,dp);
    }
    public static void main(String[] args){
        int n = 15;
        int[] dp = new int[n+1]; 
        System.out.println(fib(n,dp));
    }
}
