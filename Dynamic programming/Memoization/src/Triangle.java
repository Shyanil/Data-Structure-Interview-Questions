import java.util.Arrays;

public class Triangle {

    // This function returns the minimum path sum in a triangle
    public static int minimumPathSum(int[][] triangle) {
        int m = triangle.length; // Number of rows in the triangle
        int[][] dp = new int[m][m]; // DP array to store the minimum sum for each position
        for (int[] rows : dp) {
            Arrays.fill(rows, -1); // Initialize all values in the dp array to -1
        }
        // Call the helper function to calculate the minimum path sum
        return minimumPathSumH(triangle, m, 0, 0, dp);
    }

    // Helper function to recursively calculate the minimum path sum
    private static int minimumPathSumH(int[][] triangle, int m, int i, int j, int[][] dp) {
        // If we reach the last row, return the value at that position
        if (i == m - 1) return triangle[m - 1][j];

        // If this position has already been computed, return the stored result
        if (dp[i][j] != -1) return dp[i][j];

        // Recursively calculate the sum for going down the triangle
        int down = triangle[i][j] + minimumPathSumH(triangle, m, i + 1, j, dp);

        // Recursively calculate the sum for going diagonally
        int diagonal = triangle[i][j] + minimumPathSumH(triangle, m, i + 1, j + 1, dp);

        // Store the minimum of the two paths (down and diagonal) and return the result
        return dp[i][j] = Math.min(down, diagonal);
    }
}

/*
Time Complexity:
- In the worst case, the function calls each element in the triangle once, making the time complexity O(m^2), where m is the number of rows in the triangle.

Space Complexity:
- We use a 2D DP array of size m x m to store the results of subproblems. Therefore, the space complexity is O(m^2), where m is the number of rows in the triangle.
*/
