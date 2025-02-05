import java.util.Arrays;

public class Maximum_Path_Sum_in_the_matrix {

    // Function to find the maximum path sum in the matrix
    public static int getMaxPathSum(int[][] matrix) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        int maxi = Integer.MIN_VALUE; // Variable to store the maximum sum

        // DP table to store the results of subproblems
        int[][] dp = new int[n][m];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1); // Initialize DP table with -1
        }

        // Loop through each cell in the last row to find the maximum possible sum from that cell
        for (int j = 0; j < m; j++) {
            int ans = getUntill(n - 1, j, m, matrix, dp); // Get the maximum sum from the current column in the last row
            maxi = Math.max(maxi, ans); // Update maxi with the maximum value
        }

        return maxi; // Return the maximum sum found
    }

    // Helper function to compute the maximum path sum using recursion and memoization
    private static int getUntill(int i, int j, int m, int[][] matrix, int[][] dp) {
        // Base case: If the column index is out of bounds, return a very small value
        if (j < 0 || j >= m) return (int) Math.pow(-10, 9);

        // Base case: If we are at the first row, return the value of the cell
        if (i == 0) return matrix[0][j];

        // If the result is already computed, return it from the DP table
        if (dp[i][j] != -1) return dp[i][j];

        // Recursively compute the maximum sum for the three possible moves:
        // 1. Move up
        int up = matrix[i][j] + getUntill(i - 1, j, m, matrix, dp);
        // 2. Move diagonally left-up
        int leftDiagonal = matrix[i][j] + getUntill(i - 1, j - 1, m, matrix, dp);
        // 3. Move diagonally right-up
        int rightDiagonal = matrix[i][j] + getUntill(i - 1, j + 1, m, matrix, dp);

        // Store the maximum of the three paths in the DP table and return it
        return dp[i][j] = Math.max(up, Math.max(leftDiagonal, rightDiagonal));
    }
}

/*

    Time Complexity:
    Recursion with Memoization:

    The function getUntill is called for each cell in the matrix.

    Since we are using memoization (dp table), each cell is computed only once.

    There are n * m cells in the matrix, so the time complexity is O(n * m).

    Overall Time Complexity:

    The outer loop in getMaxPathSum iterates over m columns.

    For each column, the getUntill function is called, but due to memoization, the total time complexity remains O(n * m).

    Space Complexity:
    DP Table:

    The dp table is used to store the results of subproblems, which requires O(n * m) space.

    Recursion Stack:

    The recursion stack can go up to n levels deep (one for each row), so the space complexity for the recursion stack is O(n).

    Overall Space Complexity:

    The total space complexity is O(n * m) due to the DP table.


* */