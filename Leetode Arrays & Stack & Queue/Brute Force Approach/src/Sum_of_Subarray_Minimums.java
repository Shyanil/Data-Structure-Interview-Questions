import java.util.ArrayList;
import java.util.List;

public class Sum_of_Subarray_Minimums {
    public static  int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007; // Define the modulo value
        int n = arr.length;
        long sum = 0; // Use long to avoid overflow during calculations


        for(int i = 0; i <n; i++){
            for(int j = i; j < n; j++){
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j ; k++) {
                    list.add(arr[k]);
                }


                int min = Integer.MAX_VALUE;
                for (int num : list){
                    min = Math.min(min , num);
                }
                 sum = (sum + min) % MOD;
            }
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(sumSubarrayMins(arr)); // Output: 17
    }
}
