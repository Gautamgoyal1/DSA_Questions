import java.util.Scanner;
public class MinCostClimbing {
    public static int minCostClimbing(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0]; dp[1] = arr[1];
        for(int i=2 ; i<n ; i++){
            dp[i] = arr[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Arrays Elements: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Min Cost to Climb Stairs is: " + minCostClimbing(arr));
        sc.close();
    }
}
