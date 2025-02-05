public class Cherry_Pickup_II {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        return cherryPickupH(0 , 0 , m-1 , n , m , grid);
    }

    private int cherryPickupH(int i, int j1, int j2, int n, int m, int[][] grid) {
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) return (int) -1e9;
        if (i == n - 1){
            if(j1 == j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        int maxi = Integer.MIN_VALUE;
        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for (int dj2 = -1; dj2 <=1 ; dj2++) {
                int ans;
                if(j1 == j2) {
                    ans =  grid[i][j1] + cherryPickupH(i + 1, dj1 + j1, dj2 + j2, n, m, grid);
                } else {
                    ans = grid[i][j1] + grid[i][j2] + cherryPickupH(i + 1, dj1 + j1 , dj2 + j2 , n , m , grid);
                }
                maxi = Math.max(ans , maxi);
            }
        }
        return  maxi;
    }
}
