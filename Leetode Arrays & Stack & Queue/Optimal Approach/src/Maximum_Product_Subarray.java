class Maximum_Product_Subarray {

    // Function to find the maximum product of a contiguous subarray
    public int maxProduct(int[] nums) {
        // Initialize 'maxi' to the smallest possible integer value
        // to ensure we can correctly find the maximum product
        int maxi = Integer.MIN_VALUE;

        // 'prefix' stores the product of elements from the left to the right
        // 'suffix' stores the product of elements from the right to the left
        int prefix = 1, suffix = 1;

        // Traverse the array from left to right
        for (int i = 0; i < nums.length; i++) {
            // Reset prefix and suffix products if they become 0
            prefix = (prefix == 0) ? 1 : prefix;
            suffix = (suffix == 0) ? 1 : suffix;

            // Update prefix product (left to right)
            prefix = prefix * nums[i];

            // Update suffix product (right to left)
            suffix = suffix * nums[nums.length - i - 1];

            // Update the maximum product found so far
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }

        // Return the maximum product found
        return maxi;
    }

    // Main method to test the maxProduct function
    public static void main(String[] args) {
        // Create an instance of the Maximum_Product_Subarray class
        Maximum_Product_Subarray solution = new Maximum_Product_Subarray();

        // Example input array
        int[] nums = {2, 3, -2, 4};

        // Call the maxProduct function and print the result
        int result = solution.maxProduct(nums);
        System.out.println("Maximum product of subarray: " + result);
    }
}



/* 


Time and Space Complexity:
Time Complexity:

The algorithm iterates through the input array only once.
For each element, a constant number of operations (multiplications and comparisons) are performed.
Time Complexity = O(n), where n is the length of the input array.
Space Complexity:

We use a constant amount of extra space for the variables maxi, prefix, and suffix. These are just integer variables and do not depend on the size of the input array.
Space Complexity = O(1), as we do not use any additional data structures like arrays or lists that grow with the input size.


*/