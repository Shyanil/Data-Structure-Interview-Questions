public class House_Robber {
    public static int rob(int[] nums) {
        return robH(nums, nums.length - 1);
    }

    private static int robH(int[] nums, int index) {
        if (index == 0) {
            return nums[index];
        }
        if (index < 0) {
            return 0;
        }
        int pick = nums[index] + robH(nums, index - 2);
        int notPick = robH(nums, index - 1);
        return Math.max(pick, notPick);
    }

    public static void main(String[] args) {
        // Test the rob method with a sample input
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + rob(nums));
    }
}
