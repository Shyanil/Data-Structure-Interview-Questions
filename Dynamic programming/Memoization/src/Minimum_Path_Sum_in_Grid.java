import java.util.Arrays;

public class Minimum_Path_Sum_in_Grid {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row :  dp){
            Arrays.fill(row , -1);
        }
        return minPathSumH(grid, m - 1, n - 1 , dp);
    }

    private static int minPathSumH(int[][] grid, int m, int n, int[][] dp) {
        if (m == 0 && n == 0) return grid[0][0];
        if (m < 0 || n < 0) return (int) Math.pow(10 , 9);
        if (dp[m][n] != -1) return dp[m][n];
        int up = grid[m][n] + minPathSumH(grid , m - 1 , n , dp);
        int left = grid[m][n] + minPathSumH(grid , m , n - 1 , dp);
        return dp[m][n] = Math.min(up , left);

    }
}
