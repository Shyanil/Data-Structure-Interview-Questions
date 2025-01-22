import java.util.Arrays;

public class Frog_Jump {
    public static void main(String[] args) {
        int[] stones ={30,10,60 , 10 , 60 , 50};
        int [] dp = new int[stones.length];
        Arrays.fill(dp , -1);
        int min = Frog_JumpFN(dp , stones);
        System.out.println(min);
    }

    public static int Frog_JumpFN(int[] dp , int[] stones){
        dp[0] = 0;
        for (int i = 1; i < stones.length; i++) {
            int fs = dp[i -1] + Math.abs(stones[i] - stones[i -1]);
            int ss =  Integer.MAX_VALUE;
            if(i > 1){
                ss = dp[i - 2] + Math.abs(stones[i] - stones[i - 2]);
            }

            dp[i] = Math.min(fs , ss);
        }
        return dp[stones.length-1];
    }
}
