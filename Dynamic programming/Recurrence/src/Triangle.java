public class Triangle {
    public static int minimumPathSum(int[][] triangle) {
       int m = triangle.length;
       int n = triangle[0].length;
       return minimumPathSumH(triangle , m , n , 0 , 0);
    }

    private static int minimumPathSumH(int[][] triangle, int m, int n ,int i , int j) {
        if(i == m - 1) return triangle[m - 1][j];
        int down = triangle[i][j] + minimumPathSumH(triangle , m , n , i + 1 , j);
        int diagonal = triangle[i][j] + minimumPathSumH(triangle , m , n , i + 1 , j + 1);
        return Math.min(down , diagonal);
    }
}
//  https://www.naukri.com/code360/problems/triangle_1229398?source=youtube&campaign=striver_dp_videos