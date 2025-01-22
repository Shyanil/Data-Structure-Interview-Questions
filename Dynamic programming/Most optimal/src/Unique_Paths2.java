import java.util.Arrays;

public class Unique_Paths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return uniquePathsWithObstaclesH(m, n, obstacleGrid);
    }

    private static int uniquePathsWithObstaclesH(int m, int n, int[][] obstacleGrid) {
        int [] prev = new int[n];
        for (int i = 0; i < m; i++) {
            int [] temp = new int[n];
            for (int j = 0; j < n; j++) {
                if(obstacleGrid[i][j] == 1){
                    temp[j]= 0;
                    continue;
                }
                if (i == 0 && j == 0){
                    temp[j] = 1;
                    continue;
                }
                int up=0;
                int left=0;
                if(i > 0){
                    up = prev[j];
                }
                if(j > 0){
                    left = temp[j - 1];
                }
                temp[j] = up + left;
            }
            prev = temp;
        }
        return prev[n-1];
    }


}