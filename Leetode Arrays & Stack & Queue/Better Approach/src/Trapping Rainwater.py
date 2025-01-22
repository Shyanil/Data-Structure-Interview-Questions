import math

class Solution:
    def Trapping_Rainwater(self, arr):
        """
        This function calculates the total amount of trapped rainwater in the elevation map.
        Time Complexity: O(n) - We loop through the array once to calculate total trapped rainwater.
        Space Complexity: O(1) - We are not using any additional space except for variables.
        """
        total = 0
        n = len(arr)
        for i in range(n):
            leftMax = self.preFix(i, arr)   # O(n) for each call to preFix
            rightMax = self.suFix(i, arr)  # O(n) for each call to suFix
            if arr[i] < leftMax and arr[i] < rightMax:
                total += min(leftMax, rightMax) - arr[i]
        return total

    def preFix(self, i, arr):
        """
        This function calculates the maximum height from the left side up to index i.
        Time Complexity: O(i) - We loop from 0 to i.
        Space Complexity: O(1) - We are only using a few variables.
        """
        leftMax = 0
        for j in range(i + 1):
            leftMax = max(leftMax, arr[j])
        return leftMax

    def suFix(self, i, arr):
        """
        This function calculates the maximum height from the right side up to index i.
        Time Complexity: O(n - i) - We loop from i to the end of the array.
        Space Complexity: O(1) - We are only using a few variables.
        """
        rightMax = 0
        for j in range(i, len(arr)):
            rightMax = max(rightMax, arr[j])
        return rightMax

# Main function
if __name__ == "__main__":
    # Example usage
    sol = Solution()
    arr = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    result = sol.Trapping_Rainwater(arr)
    print("Total trapped rainwater:", result)
