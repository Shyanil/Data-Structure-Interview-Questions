import java.util.Arrays;

public class fibonacci {
    public static int Creation(int n) {
        // Creating an array to store Fibonacci numbers, initialized to -1
        int [] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        // Base case: If n is 0 or 1, return n
        if(n <= 1) {
            return n;
        }

        // Calling the helper function to calculate Fibonacci number with memoization
        return fHelper(n, dp);
    }

    private static int fHelper(int n, int[] dp) {
        // Base case: If n is 0 or 1, return n
        if(n <= 1){
            return n;
        }

        // If Fibonacci number for n is already computed, return the stored value
        if (dp[n] != -1) {
            return dp[n];
        }

        // Otherwise, calculate the Fibonacci number recursively with memoization
        // Store the result in the dp array for future reference
        return dp[n] = fHelper(n - 1, dp) + fHelper(n - 2, dp);
    }

    public static void main(String[] args) {
        // Testing the Fibonacci function with n = 26
        System.out.println(Creation(26));
    }
}
/*
* Time and Space Complexity:
Time complexity: O(n) – Each Fibonacci number from 0 to n is computed once and stored in the dp array. The memoization ensures that each subproblem is solved only once.
Space complexity: O(n) – We use an array dp of size n+1 to store the Fibonacci numbers. Thus, the space complexity is proportional to the input size n.
*
* */