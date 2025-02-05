public class Maximum_Path_Sum_in_the_matrix {

    // Function to find the maximum path sum in the matrix
    public static int getMaxPathSum(int[][] matrix) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Arrays to store the maximum path sums for the previous and current rows
        int[] prev = new int[m]; // Represents the previous row
        int[] curr = new int[m]; // Represents the current row being processed

        // Initialize the first row of the matrix
        for (int j = 0; j < m; j++) {
            prev[j] = matrix[0][j];
        }

        // Iterate through each row of the matrix starting from the second row
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Path coming from the top directly
                int up = matrix[i][j] + prev[j];

                // Path coming from the top-left diagonal
                int leftD = matrix[i][j];
                if (j - 1 >= 0) leftD += prev[j - 1];
                else leftD += (int) -1e9; // If out of bounds, add a very small value

                // Path coming from the top-right diagonal
                int rightD = matrix[i][j];
                if (j + 1 < m) rightD += prev[j + 1];
                else rightD += (int) -1e9; // If out of bounds, add a very small value

                // Calculate the maximum of all possible paths for the current cell
                curr[j] = Math.max(up, Math.max(leftD, rightD));
            }
            // Update the previous row with the current row values
            prev = curr.clone();
        }

        // Find the maximum path sum in the last row
        int maxi = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            maxi = Math.max(maxi, prev[j]);
        }

        return maxi;
    }

    // Time Complexity: O(n * m)
    // Explanation: We traverse each cell of the matrix once. For each cell, the maximum path sum is computed in O(1) time.
    // - Outer loop iterates through `n` rows.
    // - Inner loop iterates through `m` columns.
    // Thus, the overall time complexity is O(n * m).

    // Space Complexity: O(m)
    // Explanation: We use two arrays (`prev` and `curr`) of size `m` to store the maximum path sums for the previous and current rows.
    // The space required is proportional to the number of columns, so the space complexity is O(m).
}
