import java.util.Arrays;

public class House_Robber2 {
    public static int rob(int[] nums) {
       int n = nums.length;
       if(n == 1){
           return nums[0];
       }
       int [] dp1 = new int[nums.length];
        int [] dp2 = new int[nums.length];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);
        return  Math.max(robH(nums , 1 , nums.length -1 , dp1) , robH(nums , 0 , nums.length-2 , dp2));
    }

    public static int robH(int[] nums , int start , int end , int[] dp){
        if(start == end){
            return nums[end];
        }
        if (end < start){
            return 0;
        }
        if(dp[end] != -1){
            return dp[end];
        }

        int take = nums[end] + robH(nums , start , end - 2 , dp);
        int notTake = robH(nums , start , end - 1 , dp);
        return dp[end] = Math.max(take , notTake);
    }

    public static void main(String[] args) {
        // Test the rob method with a sample input
        int[] nums = {2, 3 , 2};
        System.out.println("Maximum amount that can be robbed: " + rob(nums));
    }

    // https://chatgpt.com/share/676fdb0f-2560-8009-a368-ca769644d401
}
