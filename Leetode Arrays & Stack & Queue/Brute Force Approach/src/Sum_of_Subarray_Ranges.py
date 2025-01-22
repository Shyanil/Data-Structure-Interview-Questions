import math

class Solution():
    def subArrayRanges(self, nums):
        n = len(nums)
        total_Sum = 0
        for i in range(n):
            maxE = minE = nums[i]
            for j in range(i, n):
                maxE = max(maxE, nums[j])
                minE = min(minE, nums[j])

                total_Sum += maxE - minE
        return total_Sum


if __name__ == "__main__":
    # Example usage:
    solution = Solution()
    nums = [1, 2, 3]
    result = solution.subArrayRanges(nums)
    print(result)  # Output: 4 (as expected from the example)
