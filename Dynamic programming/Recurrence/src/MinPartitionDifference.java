public class MinPartitionDifference {
    // https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/description/
    public int minimumDifference(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        return minimumDifferenceH(nums , nums.length - 1 , 0 , totalSum , 0);
    }

    private int minimumDifferenceH(int[] nums, int index, int s1, int s2 , int count1) {
        int n = nums.length / 2;
        if(index < 0){
            return count1 == n ? Math.abs(s1 - s2) : Integer.MAX_VALUE;
        }
        int includeINP = minimumDifferenceH(nums , index - 1 , s1 + nums[index] , s2 - nums[index] , count1++);
        int excludeINP = minimumDifferenceH(nums , index - 1 , s1  , s2 , count1++);
        return Math.min(includeINP , excludeINP);
    }
}
