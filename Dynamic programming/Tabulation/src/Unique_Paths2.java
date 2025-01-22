import java.util.Arrays;

public class Unique_Paths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return uniquePathsWithObstaclesH(m, n, obstacleGrid, dp);
    }

    private static int uniquePathsWithObstaclesH(int m, int n, int[][] obstacleGrid, int[][] dp) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(obstacleGrid[i][j] == 1){ dp[i][j]= 0; continue;}
                if (i == 0 && j == 0){ dp[i][j] = 1; continue;}
                int up =0;
                int left = 0;
                if (i > 0) up = dp[i-1][j];
                if (j > 0) left = dp[i][j-1];
                dp[i][j] = up + left;
            }
        }
        return dp[m-1][n-1];
    }
}