class Solution(object):
    def canPartition(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        totalsum = sum(nums)
        n = len(nums)
        if totalsum % 2 == 1:
            return False
        dp = [[None] * (k +1) for _ in range (n)]
        target = totalsum // 2
        return self.canPartitionH(n - 1 , target , nums , dp)

    def canPartitionH(self , index , target , nums , dp):
        if target == 0:
            return True
        if index == 0:
            return nums[index] == target
        if dp[index][target] is not None:
            return dp[index][target]

        notTake = self.canPartitionH(index - 1 , target , nums , dp)
        Take = False
        if arr[index] <= target:
            Take = self.canPartitionH(index - 1 , target - nums[index] , nums , dp)
        dp[index][target] = notTake or Take
        return dp[index][target]


