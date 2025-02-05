public class Count_Subsets_with_Sum_K {
        static int MOD = 1000000007;
        public static int findWays(int[] num, int tar) {
                int [] prev =  new int[tar + 1];
                prev[0] = 1;

                if (num[0] <= tar){
                        prev[num[0]] = 1;
                }

                for (int i = 1; i < num.length ; i++) {
                        int[] curr = new int[tar + 1];
                        curr[0] = 1;
                        for (int target = 1; target <= tar ; target++) {
                                int notTake = prev[target];
                                int Take = 0;
                                if (num[i] <= target){
                                        Take = prev[target - num[i]];
                                }
                                curr[target] =(int) (notTake + Take) % MOD;
                        }

                        prev = curr;
                }
                return prev[tar];
        }
}