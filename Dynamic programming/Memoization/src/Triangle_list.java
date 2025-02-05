import java.util.*;

public class Triangle_list {
    // This function calculates the minimum path sum from top to bottom in a triangle
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();  // Get the number of rows in the triangle

        // Initialize a DP table to store intermediate results, -1 means uncalculated
        int[][] dp = new int[m][m];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);  // Fill the dp table with -1 to mark unvisited positions
        }

        // Time complexity: O(m^2), since we will call minimumTotalH at most m^2 times (each cell in dp array)
        // Space complexity: O(m^2), as we are using a 2D dp array of size m x m
        return minimumTotalH(triangle, m, 0, 0, dp); // Call the helper function to calculate the minimum path sum starting from (0, 0)
    }

    // Helper function to calculate the minimum path sum recursively with memoization
    private int minimumTotalH(List<List<Integer>> triangle, int m, int i, int j, int[][] dp) {
        // Base case: If we're at the last row, return the value at the current position
        if (i == m - 1) return triangle.get(i).get(j);

        // If the result has already been computed for this position, return it from dp table
        if (dp[i][j] != -1) return dp[i][j];

        // Recursively calculate the minimum path sum by going down or diagonally
        int down = triangle.get(i).get(j) + minimumTotalH(triangle, m, i + 1, j, dp); // Path going downward
        int diagonal = triangle.get(i).get(j) + minimumTotalH(triangle, m, i + 1, j + 1, dp); // Path going diagonally

        // Store the result in dp table and return the minimum of the two paths
        dp[i][j] = Math.min(down, diagonal);

        // Time complexity: O(1) for this function as it's just a comparison and an addition
        // Space complexity: O(m^2), since we are using a 2D dp array of size m x m
        return dp[i][j];
    }
}
