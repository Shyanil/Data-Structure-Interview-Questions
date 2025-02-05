import java.util.Arrays;

public class Cherry_Pickup_II {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for (int[][] rows : dp) {
            for (int[] row : rows) {
                Arrays.fill(row, -1);
            }
        }
        return cherryPickupH(0, 0, m - 1, n, m, grid, dp);
    }

    public int cherryPickupH(int i, int j1, int j2, int n, int m, int grid[][], int dp[][][]) {
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) {
            return (int) -1e9;
        }

        if (i == n - 1) {
            if (j1 == j2) {
                return grid[i][j1];
            } else {
                return grid[i][j1] + grid[i][j2];
            }
        }
        if (dp[i][j1][j2] != -1) return dp[i][j1][j2];
        int maxi = Integer.MIN_VALUE;
        for (int dh1 = -1; dh1 <= 1; dh1++) {
            for (int dh2 = -1; dh2 <= 1; dh2++) {
                int ans;
                if (j1 == j2) {
                    ans = grid[i][j1] + cherryPickupH(i + 1, j1 + dh1, j2 + dh2, n, m, grid, dp);
                } else {
                    ans = grid[i][j1] + grid[i][j2] + cherryPickupH(i + 1, j1 + dh1, j2 + dh2, n, m, grid, dp);
                }
                maxi = Math.max(maxi, ans);

            }
        }

        return dp[i][j1][j2] = maxi;
    }
}