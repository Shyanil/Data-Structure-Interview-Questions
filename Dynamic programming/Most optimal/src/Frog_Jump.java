public class Frog_Jump {
    public static int Frog_Jump_FN(int[] stones){
        int prev_i = 0;
        int prev_2i = 0;
        for (int i = 1; i < stones.length ; i++) {
            int left =  prev_i + Math.abs(stones[i] - stones[i - 1]);
            int right = Integer.MAX_VALUE;
            if(i > 1){
                right = prev_2i + Math.abs(stones[i] - stones[i - 2]);
            }
            int cur_i = Math.min(left , right);
            prev_2i = prev_i;
            prev_i = cur_i;
        }
        return prev_i;
    }

    public static void main(String[] args) {
        int[] stones ={30,10,60 , 10 , 60 , 50};
        System.out.println(Frog_Jump_FN(stones));
    }
}
/*
* https://chatgpt.com/share/676d3c90-d208-8009-813f-713716b724b8
*
*
* */