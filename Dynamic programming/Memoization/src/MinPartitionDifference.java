import java.util.Arrays;

public class MinPartitionDifference {
    // https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/description/
    public int minimumDifference(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int [] dp = new int[nums.length + 1];
        Arrays.fill(dp , -1);
        return minimumDifferenceH(nums, nums.length - 1, 0, totalSum, 0, dp);
    }

    private int minimumDifferenceH(int[] nums, int i, int s1, int s2, int count, int[] dp) {
        int n = nums.length / 2;
        if (count > n) return  Integer.MAX_VALUE;
        if (i < 0){
            return count == n ? Math.abs(s1 - s2) : Integer.MAX_VALUE;
        }
        if (dp[i] != -1) return dp[i];
        int Take = minimumDifferenceH(nums , i - 1 , s1 + nums[i] , s2 - nums[i] , count++ , dp);
        int notTake = minimumDifferenceH(nums , i - 1 , s1 , s2 , count, dp);
        return dp[i] = Math.min(Take , notTake);
    }
}