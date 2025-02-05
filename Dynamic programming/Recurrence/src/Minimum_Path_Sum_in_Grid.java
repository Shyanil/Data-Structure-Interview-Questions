public class Minimum_Path_Sum_in_Grid {
    public static int minPathSum(int[][] grid) {
       int m = grid.length - 1;
       int n = grid[0].length - 1;
       return minPathSumH(grid , m , n);
    }

    private static int minPathSumH(int[][] grid, int m, int n) {
       if (m == 0 && n == 0) return  grid[0][0];
       if (m < 0 || n < 0) return (int) Math.pow(10, 9);
       int up = grid[m][n] + minPathSumH(grid , m - 1 , n);
       int left = grid[m][n] + minPathSumH(grid , m , n - 1);
       return Math.min(up , left);
    }
}
