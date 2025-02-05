public class Triangular {
    public static int minimumPathSum(int[][] triangle, int t) {
        int[] front = new int[t];
        int[] curr = new int[t];
        for (int i = 0; i < t; i++) {
            front[i] = triangle[t - 1][i];
        }
        for (int i = t - 2; i >= 0 ; i--) {
            for(int j = i; j >= 0; j--){
                int down = triangle[i][j] + front[j];
                int diagonal = triangle[i][j] + front[j + 1];
                curr[j] = Math.min(down , diagonal);
            }
            front = curr.clone();
        }
        return front[0];

    }
}
