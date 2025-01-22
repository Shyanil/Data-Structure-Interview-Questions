import java.util.Arrays;

public class fibonacci {
    public static int fiboFun(int n){
        int [] dp = new int[n + 1];
        Arrays.fill(dp , -1);
        return fHelper(n , dp);
    }

    private static int fHelper(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        // Time complexity: O(n) - The loop runs 'n-1' times (since we start from i=2)
        // Space complexity: O(n) - We store an array of size n+1 to store the Fibonacci values
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fiboFun(26));
    }
}
