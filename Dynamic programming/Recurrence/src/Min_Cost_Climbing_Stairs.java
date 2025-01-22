public class Min_Cost_Climbing_Stairs {
    public static  int minCostClimbingStairs(int[] cost) {
        return  Math.min(minCostClimbingStairsH(cost ,  cost.length - 1) , minCostClimbingStairsH(cost , cost.length - 2));
    }

    public static int minCostClimbingStairsH(int[] cost , int index){
        if(index  < 0){
            return 0;
        }


        int fs = minCostClimbingStairsH(cost , index - 1) + cost[index];
        int ss = Integer.MAX_VALUE;
        if(index > 0){
            ss = minCostClimbingStairsH(cost , index - 2)+ cost[index];
        }
        return Math.min(fs , ss);

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
