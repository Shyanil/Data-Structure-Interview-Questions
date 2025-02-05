import java.util.Arrays;

public class Count_Subsets_with_Sum_K {
        static int MOD = 1000000007;
        public static int findWays(int[] num, int tar) {
            int n = num.length;
            int[][] dp = new int[n][tar + 1];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            return findWaysH(n - 1, tar, num, dp);
        }

        private static int findWaysH(int index, int tar, int[] num, int[][] dp) {
            // Base cases
            if (tar == 0) return 1;
            if (index < 0) return 0;

            // Check memoized result
            if (dp[index][tar] != -1) return dp[index][tar];

            // Not take case
            long notTake = findWaysH(index - 1, tar, num, dp);

            // Take case
            long take = 0;
            if (num[index] <= tar) {
                take = findWaysH(index - 1, tar - num[index], num, dp);
            }

            // Use long for intermediate calculations to prevent overflow
            dp[index][tar] = (int)((notTake + take) % MOD);
            return dp[index][tar];
        }

}