public class Subset_Sum_Equal_To_K {

    public static boolean subsetSumToK(int n, int k, int[] arr) {
        Boolean [][] dp = new Boolean[n][k+1];
        return subsetSumToKH(n - 1, k, arr , dp);  // Start from the last index
    }

    private static boolean subsetSumToKH(int i, int k, int[] arr, Boolean[][] dp) {
        if(k == 0) return true;
        if(i == 0) return arr[0] == k;
        if(dp[i][k] != null) return dp[i][k];
        boolean notTake = subsetSumToKH(i - 1 , k , arr,dp);
        boolean Take = false;
        if(arr[i] <= k){
            Take = subsetSumToKH( i - 1 , k - arr[i] , arr , dp);
        }

        dp[i][k] = notTake || Take;
        return dp[i][k];
    }
}