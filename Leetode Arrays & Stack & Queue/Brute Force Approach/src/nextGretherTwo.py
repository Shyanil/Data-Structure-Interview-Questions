class Solution(object):
    def nextGreaterElements(self, nums):
        """
        Finds the next greater element for each element in the array `nums` 
        considering it as circular. If no greater element exists, -1 is returned.
        
        Args:
        nums (list): A list of integers.

        Returns:
        list: A list containing the next greater elements or -1 if none exists.
        """
        n = len(nums)  # Get the length of the input array
        nge = [-1] * n  # Initialize the result array with -1
        # Loop through each element in the array
        for i in range(n):
            # Check the next `n` elements circularly
            for j in range(i + 1, i + n):
                index = j % n  # Calculate the circular index
                if nums[index] > nums[i]:  # If a greater element is found
                    nge[i] = nums[index]  # Update the result for the current element
                    break  # Stop further searching
        return nge


# Main function to test the solution
if __name__ == "__main__":
    # Example input
    nums = [1, 2, 1]
    # Create an instance of the Solution class
    solution = Solution()
    # Call the nextGreaterElements method and print the result
    print("Input array:", nums)
    print("Next greater elements:", solution.nextGreaterElements(nums))
