class Solution(object):
    def canPartition(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        totalSum = sum(nums)
        n = len(nums)
        if totalSum % 2 == 1:
            return False

        target = totalSum // 2
        prev = [False] * (target + 1)
        prev[0] = True

        if nums[0] <= target:
            prev[nums[0]] = True

        for i in range(1 , n):
            curr = [False] * (target + 1)
            curr[0] = False
            for j in range(1 , target + 1):
                notTake = prev[j]
                Take = False
                if nums[i] <= j:
                    Take = prev[j - nums[i]]
                curr[j] = notTake or Take
            prev  = curr
        return prev[target]

