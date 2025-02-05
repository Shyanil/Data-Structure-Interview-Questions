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
        k = totalsum // 2
        return self.canPartitionH(n - 1 , k , nums)

    def canPartitionH(self , index , k , nums):
        if k == 0:
            return True
        if index == 0:
            return nums[index] == k

        notTake = self.canPartitionH(index - 1,  k , nums)
        Take = False
        if (nums[index] <= k):
            Take = self.canPartitionH(index - 1, k - nums[index] , nums)
        return notTake or Take

