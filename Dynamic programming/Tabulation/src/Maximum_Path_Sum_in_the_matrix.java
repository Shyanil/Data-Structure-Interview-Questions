import java.util.Arrays;

public class Maximum_Path_Sum_in_the_matrix {

    // Function to find the maximum path sum in the matrix
    public static int getMaxPathSum(int[][] matrix) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Create a DP table to store the maximum path sum up to each cell
        int[][] dp = new int[n][m];

        // Initialize the first row of the DP table with the values from the matrix
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Calculate the possible paths to reach the current cell:
                // 1. From the cell directly above (up)
                int up = matrix[i][j] + dp[i - 1][j];

                // 2. From the cell diagonally above and to the left (leftDiagonal)
                int leftDiagonal = matrix[i][j];
                if (j - 1 >= 0) {
                    leftDiagonal += dp[i - 1][j - 1];
                } else {
                    // If out of bounds, assign a very small value to ignore this path
                    leftDiagonal += (int) Math.pow(-10, 9);
                }

                // 3. From the cell diagonally above and to the right (rightDiagonal)
                int rightDiagonal = matrix[i][j];
                if (j + 1 < m) {
                    rightDiagonal += dp[i - 1][j + 1];
                } else {
                    // If out of bounds, assign a very small value to ignore this path
                    rightDiagonal += (int) Math.pow(-10, 9);
                }

                // Store the maximum of the three paths in the DP table
                dp[i][j] = Math.max(up, Math.max(leftDiagonal, rightDiagonal));
            }
        }

        // Find the maximum value in the last row of the DP table
        int maxi = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxi = Math.max(maxi, dp[n - 1][j]);
        }

        // Return the maximum path sum
        return maxi;
    }

    // Time Complexity: O(n * m)
    // - We iterate through each cell of the matrix once, performing constant work for each cell.
    // - n is the number of rows, and m is the number of columns.

    // Space Complexity: O(n * m)
    // - We use a DP table of size n x m to store intermediate results.
    // - If we modify the input matrix in place, we can reduce the space complexity to O(1),
    //   but this is generally not recommended as it alters the input.

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Maximum Path Sum: " + getMaxPathSum(matrix));
    }
}