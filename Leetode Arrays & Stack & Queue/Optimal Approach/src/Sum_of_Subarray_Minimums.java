import java.util.Stack;

public class Sum_of_Subarray_Minimums {
    public static int sumSubarrayMins(int[] arr) {
       int MOD = 1_000_000_007; // Define the modulo value
        int n = arr.length;
        long sum = 0; // Use long to avoid overflow during calculations
        int nse[] = findNse(arr);
        int pse[] = findPse(arr);
        for(int i = 0; i < arr.length; i++){
            int left = i -  nse[i];
            int right = pse[i] - i;

            long contribution = (long) (left * right) % MOD;
            contribution = (contribution * arr[i]) % MOD;

            // Add to the sum, ensuring it stays within MOD
            sum = (sum + contribution) % MOD;
        }
        return (int) sum;
    }

    public static int[] findNse(int arr[]){
        int nse[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            nse[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
        return nse;
    }

     public static int[] findPse(int arr[]){
        int npe[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
           for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            npe[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return npe;
    
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(sumSubarrayMins(arr)); // Output: 17
    }
}
