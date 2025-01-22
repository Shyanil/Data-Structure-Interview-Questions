import java.util.Arrays;

public class LinearSearchAlgorithm4 {
    //serch given number the index in 2D array
    public static void main(String[] args) {
        // thats how 2dArray define
        int arr [][] = {{20 , 30 , 40} , // 0 index  row
                        {40 , 50 , 56},  // 1 index row
                        {23 , 46 , 36}};  // 2 index row
       int target = 46;
       int ans[]=twoDSerch(arr, target);
       System.err.println(Arrays.toString(ans));  // Arrays.toString print Any Value of array methord of variable

    }
    static int[] twoDSerch(int arr[][], int target){
      if(arr.length == 0){
        return new int[] {-1,-1};
      }     
      for(int i=0;i<=arr.length;i++){
        for(int j=0; j<=i ; j++){
            if (target == arr[i][j]) {
                return new int[] {i,j};
            }
        }
      }
      return new int[]{-1,-1}; // here i return like this beacuse i do declare in main methord
    }
}
