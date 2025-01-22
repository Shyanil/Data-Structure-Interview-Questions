
import java.util.Arrays;

public class LinearSearchAlgorithm6 {
    // find Max and Min value in 2D array with index 
    public static void main(String[] args) {
        int arr [][] = {{20 , 30 , 40} , // 0 index  row
        {40 , 50 , 56},  // 1 index row
        {23 , 46 , 36}};  // 2 index row
        System.out.println(Arrays.toString(MinMax(arr)));
        
    }
    static int[] MinMax(int arr[][]){
        if(arr.length == 0){
            return new int[]{-1,-1,-1,-1};
        }
        // for min case you chose max value and max case min value
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // beacuse its dont value assign yet menas - 1 is no index thats why
        int minRow = -1, maxRow = -1 , minCol= -1 , maxCol = -1 ;
               for ( int i=0 ;i <  arr .length ; i++){
               for ( int  j= 0 ;j <arr[i].length; j++){
                    if(arr[i][j] < min){
                        min = arr[i][j];
                        minRow = i;
                        minCol = j;
                    } else if(arr[i][j] > max){
                        max = arr[i][j];
                        // here updated with current index valuw to find row and col
                        maxRow = i;
                        maxCol = j;
                    }
               }

               }
               System.out.println("Max: " + max);
               System.out.println("Min: " + min);
       
               return new int[] {minRow , minCol , maxRow , maxCol};

      
    }
}
