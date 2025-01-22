import java.util.Arrays;

public class Unique_Paths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int[m][n];
        for (int [] row : dp) {
            Arrays.fill(row , -1);
        }
        return uniquePathsWithObstaclesH(m - 1, n - 1, obstacleGrid,dp);
    }

    private static int uniquePathsWithObstaclesH(int m, int n, int[][] obstacleGrid, int[][] dp) {
        if(m >= 0 && n>= 0 && obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        int up = uniquePathsWithObstaclesH(m-1 ,n , obstacleGrid,dp);
        int left = uniquePathsWithObstaclesH(m , n-1, obstacleGrid,dp);
        return dp[m][n] = up + left;
    }


}