public class Cherry_Pickup_II {
    public int cherryPickup(int[][] grid) {
        int n = grid.length; // Number of rows
        int m = grid[0].length; // Number of columns
        int[][] font =  new int[m][m];
        int[][] curr = new int[m][m];
        for(int j1 = 0; j1 < m; j1++){
            for(int j2 = m - 1; j2 >= 0; j2--){
                if(j1 == j2){
                    font[j1][j2] = grid[n-1][j1];
                } else {
                    font[j1][j2] = grid[n-1][j1] + grid[n-1][j2];
                }
            }
        }

        for (int i = n -2; i >= 0 ; i--) {
            for(int j1 = 0; j1 < m; j1++){
                for(int j2 = m - 1; j2 >= 0; j2--){
                   int maxi = Integer.MIN_VALUE;
                    for (int dh1 = -1; dh1 <= 1; dh1++) {
                        for (int dh2 = -1; dh2 <=1 ; dh2++) {
                            int ans;
                            if (j1 == j2) ans = grid[i][j1];
                             else ans = grid[i][j1] + grid[i][j2];
                            if((j1 + dh1 < 0 || j1 + dh1 >= m) || (j2 + dh2 < 0 || j2 + dh2 >= m)){
                                ans += (int) -1e9;
                            } else {
                                ans += font[j1 + dh1][j2+dh2];
                            }
                            maxi = Math.max(maxi , ans);
                    }
                }

                    curr[j1][j2]= maxi;

            }
        }

            for (int a = 0; a < m; a++) {
                font[a] = curr[a].clone();
            }
        }

        return font[0][m - 1];
    }
}