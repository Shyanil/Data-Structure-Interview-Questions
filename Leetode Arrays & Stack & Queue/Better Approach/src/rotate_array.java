class Solution {
    public void rotate(int[] nums, int k) {
        // Edge cases: if the array is null or has only one element, no rotation is needed
        if (nums == null) return;
        if (nums.length == 1) return;

        int length = nums.length;

        // Reduce k to avoid unnecessary rotations (k can be larger than length)
        int rotation = k % length;

        // Step 1: Reverse the entire array
        int start = 0;
        int end = length - 1;
        while (start < end) {
            swap(nums, start, end);  // Swap the elements at start and end
            start++;
            end--;
        }

        // Step 2: Reverse the first k elements (after full reversal)
        start = 0;
        end = rotation - 1;
        while (start < end) {
            swap(nums, start, end);  // Swap the elements at start and end
            start++;
            end--;
        }

        // Step 3: Reverse the remaining n - k elements
        start = rotation;
        end = length - 1;
        while (start < end) {
            swap(nums, start, end);  // Swap the elements at start and end
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in the array
    public void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

/* 
Time Complexity: O(n) 
- Reversing the entire array takes O(n).
- Reversing the first k elements takes O(k).
- Reversing the remaining n - k elements takes O(n - k).
Thus, total time complexity is O(n).

Space Complexity: O(1) 
- The algorithm operates in-place with constant extra space.
*/
