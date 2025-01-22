import java.util.Arrays;

public class Frog_Jump_with_K_Distance {
    public static int Frog_Jump_with_K_DistanceHelper(int[] stones, int [] dp , int index , int k){
        if(index == 0){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int fs = Integer.MAX_VALUE;
        for (int j = 1; j <= k ; j++) {
            if (index - j >= 0) {
                int jump = Frog_Jump_with_K_DistanceHelper(stones, dp, index - j , k) + Math.abs(stones[index] - stones[index - j]);
                fs = Math.min(jump , fs);
            }
        }
        return dp[index] = fs;
    }

    public  static int helper(int[] stones , int k){
        int [] dp = new int[stones.length + 1];
        Arrays.fill(dp , -1);
        return Frog_Jump_with_K_DistanceHelper(stones , dp , stones.length - 1 , k);
    }

    public static void main(String[] args) {
        int[] stones = { 30, 10, 60, 10, 60, 50 };
        System.out.println(helper(stones , 2));

    }


}
