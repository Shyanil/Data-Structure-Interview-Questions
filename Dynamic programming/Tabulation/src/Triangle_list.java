import java.util.List;

public class Triangle_list {
    //    https://leetcode.com/problems/triangle/
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for (int j = 0; j < m; j++) {
            dp[m - 1][j] = triangle.get(m - 1).get(j);

        }
        for (int d = m - 2; d >= 0; d--) {
           for (int j = d; j >= 0; j--){
               int down = triangle.get(d).get(j) + dp[d + 1][j];
               int diagonal = triangle.get(d).get(j) + dp[d + 1][j + 1];
               dp[d][j] =  Math.min(down , diagonal);
           }
        }
        return dp[0][0];
    }
}