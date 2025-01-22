import java.util.ArrayList;
import java.util.Arrays;
/* https://chatgpt.com/share/676d3c90-d208-8009-813f-713716b724b8*/
public class Frog_Jump {
    public static int Frog_jump_FN(int index, int[] stones , int[] dp) {
        if(index == 0){
            return 0;
        }
        if(dp[index] != -1){
          return dp[index];
        }
        int left = Frog_jump_FN(index - 1 , stones , dp) + Math.abs(stones[index] - stones[index - 1]);
        int right = Integer.MAX_VALUE;
        if(index > 1){
            right = Frog_jump_FN(index - 2 , stones , dp) + Math.abs(stones[index] - stones[index - 2]);
        }
        return dp[index]=Math.min(left , right);
    }

    public static void main(String[] args) {
        int[] stones ={30,10,60 , 10 , 60 , 50};
        int n = stones.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp , -1);
        System.out.println(Frog_jump_FN(n - 1 , stones , dp));

    }
}
