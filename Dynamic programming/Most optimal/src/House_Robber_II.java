public class House_Robber_II {
    public static int rob(int[] nums) {
      int n = nums.length;
      if (n == 0) return 0;
      if (n == 1) return nums[0];
      if (n == 2) return Math.max(nums[0] , nums[1]);
      int case1 = robH(nums , 0 , n - 2);
      int case2 = robH(nums , 1 , n - 1);
      return Math.max(case2 , case1);
    }

    private static int robH(int[] nums, int start, int end) {
      int prev1 = nums[start];
      int prev2 = 0;
      for (int i = start + 1; i <= end; i++) {
          int take = nums[i];
          if(i > start + 1){
              take += prev2;
          }
          int notTake = prev1;
          int cur_i = Math.max(take , notTake);
          prev2 = prev1;
          prev1 = cur_i;
        }
      return  prev1;
    }


}
