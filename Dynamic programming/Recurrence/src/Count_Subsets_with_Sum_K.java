public class Count_Subsets_with_Sum_K {
    public static int findWays(int[] num, int tar) {
        // Write your code here.
        return findWaysH(num.length - 1 , tar, num);
    }
    public static int findWaysH(int index , int tar , int[] num){
        if (tar == 0) return 1;
        if (index == 0) return num[index] == tar ? 1 : 0;
        int notTake = findWaysH(index - 1 , tar , num);
        int take = 0;

        if(num[index] <= tar){
            take = findWaysH(index - 1 , tar - num[index] , num);
        }

        return notTake + take;

    }
}
