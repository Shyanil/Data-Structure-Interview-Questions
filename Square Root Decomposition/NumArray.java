class NumArray {
  // block stores the sum of elements in each block of size sqrt
  private int[] block;
  // nums stores the original array
  private int[] nums;
  // sqrt is the size of each block, calculated using the square root of the array length
  private int sqrt;

  // Constructor to initialize the NumArray object with the given nums array
  public NumArray(int[] nums) {
    this.nums = nums;
    // Calculate the size of each block (square root of the array length)
    this.sqrt = (int) Math.sqrt(nums.length);
    int block_id = -1;
    // Initialize the block array to store block sums
    this.block = new int[(nums.length + sqrt - 1) / sqrt];
    
    // Precompute the block sums
    for (int i = 0; i < nums.length; i++) {
      // Change block_id when we reach a new block (starting index of each block)
      if (i % sqrt == 0) {
        block_id++;
      }
      // Update the block sum for the current block
      block[block_id] += nums[i];
    }
  }

  // Method to update the value at a specific index and adjust the block sum
  public void update(int index, int val) {
    // Find which block the index belongs to
    int block_id = index / sqrt;
    // Update the block sum by adding the difference (new value - old value)
    this.block[block_id] += val - nums[index];
    // Update the original array with the new value
    nums[index] = val;
  }

  // Method to calculate the sum of elements between indices l and r (inclusive)
  public int sumRange(int l, int r) {
    int ans = 0;
    
    // Process any leftover elements before reaching the start of a block
    while (l % sqrt != 0 && l < r && l != 0) {
      ans += nums[l]; // Add element at the current index to the sum
      l++; // Move to the next element
    }

    // Process complete blocks within the range
    while (l + sqrt <= r) {
      ans += block[l / sqrt]; // Add the sum of the current block
      l += sqrt; // Move to the next block
    }

    // Process any leftover elements after the last full block
    while (l <= r) {
      ans += nums[l]; // Add element at the current index to the sum
      l++; // Move to the next element
    }
    
    // Return the final computed sum
    return ans;
  }
}
