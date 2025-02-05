public class Minimum_Path_Sum_in_the_matrix {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length; // Number of rows in the matrix
        int m = matrix[0].length; // Number of columns in the matrix

        // Arrays to store the previous and current row's minimum path sums
        int[] prev = new int[m];
        int[] curr = new int[m];

        // Initialize the first row in `prev` as it has no rows above it
        for (int j = 0; j < m; j++) {
            prev[j] = matrix[0][j];
        }

        // Iterate through the matrix row by row
        for (int i = 1; i < n; i++) { // For every row except the first
            for (int j = 0; j < m; j++) { // For every column in the row
                // Calculate the minimum path sum coming from:
                // 1. Directly above (up)
                int up = matrix[i][j] + prev[j];

                // 2. Diagonally left (if within bounds)
                int leftD = matrix[i][j];
                if (j - 1 >= 0) leftD += prev[j - 1];
                else leftD += (int) 1e9; // If out of bounds, treat it as a large value

                // 3. Diagonally right (if within bounds)
                int rightD = matrix[i][j];
                if (j + 1 < m) rightD += prev[j + 1];
                else rightD += (int) 1e9; // If out of bounds, treat it as a large value

                // Store the minimum of the three paths in `curr[j]`
                curr[j] = Math.min(up, Math.min(leftD, rightD));
            }
            // Update `prev` to `curr` for the next iteration
            prev = curr.clone();
        }

        // Find the minimum path sum in the last row
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min = Math.min(min, prev[j]);
        }

        return min; // Return the minimum falling path sum
    }
}
/*
Time Complexity:
- Outer loop runs for each row: O(n)
- Inner loop runs for each column in the row: O(m)
- Finding the minimum value in the last row: O(m)
- Total time complexity: O(n × m)

Space Complexity:
- Two arrays, `prev` and `curr`, are used to store intermediate results for each row.
- Space used: O(m) + O(m) = O(m) (no extra matrix storage).
*/