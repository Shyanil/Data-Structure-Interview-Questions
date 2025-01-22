import java.util.ArrayList;
import java.util.List;

public class Sum_of_Subarray_Minimums {
    public static  int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007; // Define the modulo value
        int n = arr.length;
        long sum = 0; // Use long to avoid overflow during calculations
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            for (int j = i; j < n ; j++) {
                min = Math.min(min , arr[j]);
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
/*
*
Time Complexity:
The time complexity is O(n^2) because:
The outer loop runs n times (i from 0 to n-1).
The inner loop runs approximately n/2 times on average, giving an overall complexity of O(n^2).
Space Complexity:
The space complexity is O(1) because you are using a constant amount of extra space,
only storing variables like sum and min. The sum variable is updated in-place,
and there are no additional data structures that grow with input size.
* */