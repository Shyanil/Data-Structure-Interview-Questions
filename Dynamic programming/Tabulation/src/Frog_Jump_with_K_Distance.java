import java.util.Arrays;

public class Frog_Jump_with_K_Distance {
    public static int Frog_Jump_with_K_DistanceHelper(int [] stones , int k){
        int [] dp = new int[stones.length];
        Arrays.fill(dp , Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < stones.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(stones[i] - stones[i - j]);
                    dp[i] = Math.min(jump, dp[i]);
                }
            }
        }
        return  dp[stones.length - 1];

    }
    public static void main(String[] args) {
        int[] stones = { 30, 10, 60, 10, 60, 50 };
        System.out.println(Frog_Jump_with_K_DistanceHelper(stones , 2));
    }
}
// https://chatgpt.com/share/676e9811-cfec-8009-b81c-95be65ec8a12