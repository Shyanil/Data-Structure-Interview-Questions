public class House_Robber2 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        return Math.max(robH(nums, 1 , nums.length - 1) , robH(nums , 0 , nums.length - 2));
    }
    private static int robH(int[] nums, int start , int end){
        if(start == end){
            return nums[end];
        }
        if (end < start){
            return 0;
        }

        int take = nums[end] + robH(nums , start , end - 2);
        int notTake = robH(nums , start , end - 1);
        return Math.max(take , notTake);

    }


    public static void main(String[] args) {
        // Test the rob method with a sample input
        int[] nums = {2,3,2};
        System.out.println("Maximum amount that can be robbed: " + rob(nums));
    }
}
