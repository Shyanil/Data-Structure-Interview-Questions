import java.lang.reflect.Array;
import java.util.Arrays;

public class Unique_Paths {
    // Main function to calculate the unique paths
    public static int uniquePaths(int m, int n) {
        // DP table to store results of subproblems, initialized to -1 (not computed)
        int [][]dp = new int[m][n];
        // Fill the DP table with -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i] , -1);
        }
        // Call the helper function to calculate unique paths using memoization
        return uniquePathsH(m - 1, n - 1 , dp);
    }

    // Helper function to calculate unique paths recursively with memoization
    private static int uniquePathsH(int m, int n, int[][] dp) {
        // Base case: If we reach the top-left corner, there is one unique path (start point)
        if(m == 0 && n ==0) return 1;
        // If the position is out of bounds, return 0 (no path)
        if(m < 0 || n < 0) return 0;
        // If the result for this position is already computed, return it from the DP table
        if(dp[m][n] != -1) return dp[m][n];

        // Recursively find the number of paths from the top (up) and left (left)
        int up = uniquePathsH(m-1, n, dp);
        int left = uniquePathsH(m, n-1, dp);

        // Store the result in the DP table and return it
        return dp[m][n] = left + up;
    }
}

/*
Time Complexity:
- The time complexity is O(m * n), where 'm' is the number of rows and 'n' is the number of columns.
- This is because each cell in the DP table is calculated only once, and each calculation takes constant time.

Space Complexity:
- The space complexity is O(m * n) due to the storage of the DP table to store the intermediate results of subproblems.
- This space complexity is needed for the recursion stack and the DP table.
*/
