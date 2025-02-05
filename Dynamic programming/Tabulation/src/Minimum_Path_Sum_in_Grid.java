import java.util.Arrays;

class Minimum_Path_Sum_in_Grid {
    public int minPathSum(int[][] grid) {
        int m = grid.length; // Number of rows
        int n = grid[0].length; // Number of columns

        // dp array to store the minimum path sums at each cell
        int[][] dp = new int[m][n];

        // Iterate through each cell of the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    // Base case: top-left corner, the only path is the value of the cell itself
                    dp[i][j] = grid[i][j];
                } else {
                    // Calculate the minimum path sum for the current cell

                    // Check for valid "up" movement; if not valid, use Integer.MAX_VALUE
                    int up = (i > 0) ? dp[i - 1][j] : (int) Math.pow(10 , 9);

                    // Check for valid "left" movement; if not valid, use Integer.MAX_VALUE
                    int left = (j > 0) ? dp[i][j - 1] : (int) Math.pow(10 , 9);

                    // The current cell's value is the grid's value + the minimum of the "up" and "left" paths
                    dp[i][j] = grid[i][j] + Math.min(up, left);
                }
            }
        }

        // Return the minimum path sum to reach the bottom-right corner
        return dp[m - 1][n - 1];
    }
}

/*
 * Key Points:
 * 1. Boundary Conditions:
 *    - For the first row (i == 0), there's no valid "up" path.
 *    - For the first column (j == 0), there's no valid "left" path.
 *    - In these cases, use Integer.MAX_VALUE to ignore invalid paths during Math.min computation.
 *
 * 2. Base Case:
 *    - The top-left cell (i == 0, j == 0) is initialized directly with grid[0][0], as it's the starting point.
 *
 * Time Complexity:
 * - O(m * n), where m is the number of rows and n is the number of columns.
 * - Each cell is processed once, and the operations inside the loops are O(1).
 *
 * Space Complexity:
 * - O(m * n) for the dp array, which stores the minimum path sum at each cell.
 * - Note: The space complexity can be reduced to O(n) if only the previous row's values are stored.
 */
