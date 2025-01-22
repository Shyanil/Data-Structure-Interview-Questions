public class House_Robber {
    public static int rob(int[] nums) {
        int prev1 = nums[0];
        int prev2 = 0;
        for (int i = 1; i < nums.length; i++) {
            int take = nums[i];
            if(i > 1){
                take += prev2;
            }

            int notTake = prev1;
            int curr_i = Math.max(take , notTake);
            prev2 = prev1;
            prev1 = curr_i;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + rob(nums));
    }
}
