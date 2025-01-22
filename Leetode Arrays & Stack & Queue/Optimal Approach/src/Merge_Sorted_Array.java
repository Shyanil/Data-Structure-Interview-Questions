import java.util.Arrays;

class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2, and the merge position
        int p1 = m - 1; // Pointer for the last element of nums1's effective part
        int p2 = n - 1; // Pointer for the last element of nums2
        int p = m + n - 1; // Pointer for the last position in nums1

        // Compare elements from the back and place the larger element at position p
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--; // Move pointer in nums1 backward
            } else {
                nums1[p] = nums2[p2];
                p2--; // Move pointer in nums2 backward
            }
            p--; // Move merge position pointer backward
        }

        // If any elements are left in nums2, copy them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        Merge_Sorted_Array solution = new Merge_Sorted_Array();

        // Test case
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // nums1 has extra space for nums2
        int m = 3; // Number of elements in nums1
        int[] nums2 = {2, 5, 6}; // nums2 elements to merge
        int n = 3; // Number of elements in nums2

        // Call the merge method
        solution.merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}


/*

### Complexity:
1. **Time Complexity**: \( O(m + n) \), where \( m \) and \( n \) are the sizes of the input arrays.
2. **Space Complexity**: \( O(1) \) since no additional space is used apart from the input arrays. 

*/