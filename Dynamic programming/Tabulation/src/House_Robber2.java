import java.util.Arrays;

public class House_Robber2 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        return Math.max(robH(nums , 0 , n - 2) , robH(nums , 1 , n - 1));
    }
    public static int robH(int[] nums, int start , int end){
        if (end < start){
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp , 0) ;
        dp[start] = nums[start];
        if (start + 1 <= end){
            dp[start + 1] = Math.max(nums[start] , nums[start + 1]);
        }

        for (int i = start + 2; i <= end ; i++) {
            dp[i] = Math.max(dp[i- 1] ,  nums[i] + dp[i - 2]);
        }
        return dp[end];
    }

    public static void main(String[] args) {
        // Test the rob method with a sample input
        int[] nums = {1, 2, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + rob(nums));
    }
}