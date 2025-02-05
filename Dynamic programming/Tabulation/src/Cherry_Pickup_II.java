import java.util.Arrays;

public class Cherry_Pickup_II {
    public int cherryPickup(int[][] grid) {
        int n = grid.length; // Number of rows
        int m = grid[0].length; // Number of columns

        // 3D DP array to store the maximum cherries collected for each state (row, j1, j2)
        int[][][] dp = new int[n][m][m];

        // Initializing the base case (last row)
        for(int j1 = 0; j1 < m; j1++) {
            for (int j2 = m - 1; j2 >= 0; j2--) {
                // If both pick the same column, only one cherry is added
                if(j1 == j2) {
                    dp[n-1][j1][j2] = grid[n-1][j1];
                } else {
                    dp[n-1][j1][j2] = grid[n-1][j1] + grid[n-1][j2];
                }
            }
        }

        // Fill the DP table for the rest of the rows
    for (int i = n - 2; i >= 0; i--) {
        for(int j1 = 0; j1 < m; j1++) {
            for (int j2 = m - 1; j2 >= 0; j2--) {
                int maxi = Integer.MIN_VALUE;

                // Trying all possible moves for j1 and j2 (going left, right or staying in the same column)
                for (int dh1 = -1; dh1 <= 1; dh1++) {
                    for (int dh2 = -1; dh2 <= 1 ; dh2++) {
                        int ans;

                        // If both pick the same column, only one cherry is added
                        if (j1 == j2) {
                            ans = grid[i][j1];
                        } else {
                            ans = grid[i][j1] + grid[i][j2];
                        }

                        // If the new positions go out of bounds, assign a very small number (effectively an invalid state)
                        if((j1 + dh1 < 0 || j1 + dh1 >= m) || (j2 + dh2 < 0 || j2 + dh2 >= m)) {
                            ans += (int) -1e9;
                        } else {
                            ans += dp[i + 1][dh1 + j1][dh2 + j2];
                        }

                        // Keep track of the maximum cherries collected for this state
                        maxi = Math.max(maxi , ans);
                    }
                }

                dp[i][j1][j2] = maxi; // Store the result for the current state
            }
        }
    }

        // Return the maximum cherries that can be collected starting from the first row
        return dp[0][0][m-1];
    }
}

/*
Time Complexity:
- There are 3 nested loops for i, j1, and j2 (size n * m * m).
- Inside these loops, there are 2 more nested loops for dh1 and dh2, both iterating over a range of 3 values.
- Thus, the total time complexity is O(n * m * m * 9) = O(n * m^2), where n is the number of rows and m is the number of columns.

Space Complexity:
- The space complexity is mainly determined by the 3D DP array of size n * m * m.
- Thus, the space complexity is O(n * m^2).

Important Information:
- The problem is based on dynamic programming and uses a 3D DP table to store the maximum cherries that can be collected.
- The solution iterates over all possible moves for both j1 and j2, checking each possible transition and storing the best result for each state.
*/
