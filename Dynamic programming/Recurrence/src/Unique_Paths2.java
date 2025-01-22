public class Unique_Paths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return uniquePathsWithObstaclesH(m-1 , n-1 , obstacleGrid);
    }

    private static int uniquePathsWithObstaclesH(int m, int n, int[][] obstacleGrid) {
        if(m >= 0 && n>=0 && obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        int up = uniquePathsWithObstaclesH(m-1, n , obstacleGrid);
        int left = uniquePathsWithObstaclesH(m , n-1, obstacleGrid);
        return  up + left;
    }
    public static void main(String[] args) {


        // Example input
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        // Calling the method and printing the result
        int result = uniquePathsWithObstacles(obstacleGrid);
        System.out.println("Number of unique paths: " + result);
    }
}
