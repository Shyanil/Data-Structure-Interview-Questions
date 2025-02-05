import java.util.Arrays;

public class Count_Subsets_with_Sum_K {
        static int MOD = 1000000007;
        public static int findWays(int[] num, int tar) {
                int[][] dp = new int[num.length][tar + 1];
                for (int i = 0; i < num.length; i++) {
                    dp[i][0] = 1;
                }

                if (num[0] <= tar){
                        dp[0][num[0]] = 1;
                }

                for (int i = 1; i < num.length; i++) {
                        for (int target = 1; target <= tar; target++) {
                                int notTake = dp[i - 1][target];
                                int Take = 0;
                                if(num[i] <= target){
                                        Take = dp[i -1][target - num[i]];
                                }
                                dp[i][target] = (int) (notTake + Take) % MOD;
                        }
                }
                return dp[num.length - 1][tar];
        }
}