class Min_Cost_Climbing_Stairs{

   public int minCostClimbingStairs(int[] cost) {
     int prev1 = 0;
     int prev2 = 0;
     for(int i = 2; i <= cost.length; i++){
        int curr_i = Math.min(prev1 + cost[i - 1] ,  prev2 + cost[i - 2]);
        prev2 = prev1;
        prev1 = curr_i;
        
     }
     return prev1;
    }

}