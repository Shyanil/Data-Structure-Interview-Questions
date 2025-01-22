
public class LinearSearchAlgorithm5 {
    // find Max and Min value in 2D array
    public static void main(String[] args) {
        int arr [][] = {{20 , 30 , 40} , // 0 index  row
        {40 , 50 , 56},  // 1 index row
        {23 , 46 , 36}};  // 2 index row
        System.out.println(MinMax(arr));
        
    }
    static int MinMax(int arr[][]){
        // for min case you chose max value and max case min value
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int arrO[] : arr){
            for (int i: arrO){
                 if(i < min){
                    min = i;
                 } else if (i > max){
                    max = i;
                 }
            }
        }
        System.out.println(max);
        return min;
    }
}
