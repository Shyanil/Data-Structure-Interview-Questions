import java.util.Arrays;

public class House_Robber {
    public static int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robH(dp , nums);
    }

    private static int robH(int[] dp, int[] nums) {
        dp[0] = nums[0];
        for (int i = 1; i < nums.length ; i++) {
             int pick = nums[i];
             if(i > 1){
                 pick += dp[i - 2];
            }
             int notPick = dp[i - 1];
             dp[i] = Math.max(pick , notPick);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        // Test the rob method with a sample input
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + rob(nums));
    }
}
