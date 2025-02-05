public class Subset_Sum_Equal_To_K {

    public static boolean subsetSumToK(int n, int k, int[] arr) {
        return subsetSumToKH(n - 1, k, arr);  // Start from the last index
    }

    private static boolean subsetSumToKH(int index, int target, int[] arr) {
        // Base cases
        if (target == 0) return true;  // If target is 0, the subset is found
        if (index == 0) return arr[0] == target;  // If no more elements left and target is not 0, return false

        // Option 1: Exclude the current element
        boolean notTake = subsetSumToKH(index - 1, target, arr);

        // Option 2: Include the current element if it is not greater than the target
        boolean take = false;
        if (arr[index] <= target) {
            take = subsetSumToKH(index - 1, target - arr[index], arr);
        }

        // Return the result of either including or excluding the current element
        return notTake || take;
    }

    public static void main(String[] args) {
        // Sample Input 1
        int[] arr1 = {4, 3, 2, 1};
        System.out.println(subsetSumToK(4, 5, arr1)); // Output: true

        int[] arr2 = {2, 5, 1, 6, 7};
        System.out.println(subsetSumToK(5, 4, arr2)); // Output: false

        // Sample Input 2
        int[] arr3 = {6, 1, 2, 1};
        System.out.println(subsetSumToK(4, 4, arr3)); // Output: true

        int[] arr4 = {1, 7, 2, 9, 10};
        System.out.println(subsetSumToK(5, 6, arr4)); // Output: false
    }
}
