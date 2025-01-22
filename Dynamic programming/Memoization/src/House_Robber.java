import java.util.Arrays;

public class House_Robber {
    public static int rob(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp , -1);
        return robH(nums, nums.length - 1 , dp);
    }

    private static int robH(int[] nums, int index , int [] dp) {
       if(index == 0){
           return nums[index];
       }
       if(index < 0){
           return 0;
       }

       if(dp[index] != -1){
           return dp[index];
       }
       int pick = nums[index] + robH(nums , index - 2 , dp);
       int notPick = robH(nums , index - 1 , dp);
       return dp[index] = Math.max(pick , notPick);
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount that can be robbed: Memorization " + rob(nums));
    }
}
