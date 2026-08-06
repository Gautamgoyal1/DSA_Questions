import java.util.Scanner;
public class Nth_Tribonacii {
    public static int helper(int n , int[] dp){
        if(n<=2) return dp[n];
        if(dp[n] != 0) return dp[n];
        return dp[n] = helper(n-1,dp) + helper(n-2,dp) + helper(n-3,dp);
    }
    public static int triboonacci(int n){
        if(n == 0 ) return 0;
        if(n<=2) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        return helper(n,dp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        System.out.println("NthTribonacciNumber is: "+triboonacci(n));
        sc.close();
    }
}
