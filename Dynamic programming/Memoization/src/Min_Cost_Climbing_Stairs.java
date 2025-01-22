import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    public static int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length + 1];
        Arrays.fill(dp , -1);
        return Math.min(minCostClimbingStairsH(cost, cost.length - 1 , dp), minCostClimbingStairsH(cost, cost.length - 2 , dp));
    }

    private static int minCostClimbingStairsH(int[] cost, int index , int [] dp) {
        if(index < 0){
            return  0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        int fs = minCostClimbingStairsH(cost , index - 1, dp) + cost[index];
        int ss = Integer.MAX_VALUE;
        if(index > 0){
            ss = minCostClimbingStairsH(cost , index - 2 , dp) + cost[index];
        }
        return dp[index] = Math.min(fs , ss);
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        // Test with the example inputs
        System.out.println(minCostClimbingStairs(cost1));  // Output: 15
        System.out.println(minCostClimbingStairs(cost2));  // Output: 6
    }

    // https://chatgpt.com/share/676e36fe-8c04-800d-a45f-af573663b22c
}
