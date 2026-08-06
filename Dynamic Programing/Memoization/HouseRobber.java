import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static int calculate(int[] arr,int i,int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take = arr[i] + calculate(arr, i+2, dp);
        int skip = calculate(arr, i+1, dp);
        return dp[i] = Math.max(take,skip);
    }
    public static int rob(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return calculate(arr,0,dp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements: ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Maximum Amount Can be Stolen is: " + rob(arr));
        sc.close();
    }
}
