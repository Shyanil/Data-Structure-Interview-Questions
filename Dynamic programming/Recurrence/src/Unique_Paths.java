public class Unique_Paths {

    public static int uniquePaths(int m, int n) {
        // Base case: If we've reached the top-left corner (0, 0), there's exactly one way to stay there
        if (m == 0 && n == 0) return 1;

        // Base case: If we're out of bounds (either m or n < 0), return 0
        if (m < 0 || n < 0) return 0;

        // Recursive case: Move down (m-1) or move right (n-1)
        int up = uniquePaths(m - 1, n);  // Move up
        int left = uniquePaths(m, n - 1);  // Move left

        // Return the sum of paths from moving down and moving right
        return up + left;
    }

    public static void main(String[] args) {
        int m = 3;  // Grid size m x n (m = 3, n = 7)
        int n = 7;
        int result = uniquePaths(m - 1, n - 1);  // We call the function with m-1, n-1 to align with 0-based indexing
        System.out.println("Number of unique paths for a " + m + "x" + n + " grid: " + result);
    }
}
