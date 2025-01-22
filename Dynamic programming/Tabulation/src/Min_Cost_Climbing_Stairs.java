import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i<=cost.length; i++){
            dp[i] = Math.min(dp[i - 1]+ cost[i - 1]  , dp[i - 2] + cost[i -2]);
        }

        return dp[cost.length];
    }

    public static void main(String[] args) {
        // Test cases
        int[] cost1 = {10, 15, 20};  // Expected output: 15
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};  // Expected output: 6

        // Test with the example inputs
        System.out.println(minCostClimbingStairs(cost1));  // Output: 15
        System.out.println(minCostClimbingStairs(cost2));  // Output: 6
    }
    }