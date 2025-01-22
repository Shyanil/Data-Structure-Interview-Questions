class Maximum_Product_Subarray {
    public int Fum(int[] nums) {
        // Initialize maxP to the first element in the array
        // This keeps track of the maximum product found so far.
        int maxP = nums[0];

        // Outer loop iterates through each starting index of the subarray
        for (int i = 0; i < nums.length; i++) {
            // Initialize the product to 1 for each new starting subarray
            int product = 1;

            // Inner loop calculates the product for all subarrays starting at index i
            for (int j = i; j < nums.length; j++) {
                // Update the product by multiplying it with the current element
                product = product * nums[j];

                // Update the maximum product found so far
                maxP = Math.max(product, maxP);
            }
        }

        // Return the maximum product found
        return maxP;
    }
}

/*
 * Explanation:
 * 1. The code finds the maximum product of any contiguous subarray in the input array `nums`.
 * 2. It uses a nested loop:
 *    - The outer loop sets the starting point of the subarray.
 *    - The inner loop iterates through the end of the subarray, calculating the product.
 * 3. During each iteration, the product is updated and compared with the current maximum product (`maxP`).
 * 4. The time complexity is O(n^2), as the inner loop runs approximately n times for each of the n iterations of the outer loop.
 * 5. The space complexity is O(1) since only a few variables (`maxP`, `product`) are used, and no additional data structures are required.
 */
