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
        dp = [[False] * (target + 1) for _ in range(n)]

        for i in range(n):
            dp[i][0] = True

        if nums[0] <= target:
            dp[0][nums[0]] = True

        for i in range(1 , n):
            for j in range(1 , target + 1):
                notTake = dp[i - 1][j]
                Take = False
                if nums[i] <= j:
                    Take = dp[i - 1][j - nums[i]]
                dp[i][j] = notTake or Take
        return dp[n - 1][target]



        