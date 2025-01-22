public class Frog_Jump_with_K_Distance {

    // Function to calculate the minimum energy for frog jumps
    public static int Frog_jump_FN(int index, int[] stones, int k) {
        if (index == 0) {
            return 0; // Base case: no energy needed to stay on the first stone
        }
        int min_step = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (index - j >= 0) { // Ensure index is valid
                int jump = Frog_jump_FN(index - j, stones, k) + Math.abs(stones[index] - stones[index - j]);
                min_step = Math.min(jump, min_step); // Update minimum energy
            }
        }
        return min_step;
    }

    // Main function
    public static void main(String[] args) {
        // Define the stones and k value
        int[] stones = {30, 10, 60, 10, 60, 50}; // Example stones array
        int n = stones.length; // Number of stones
        int k = 2; // Maximum distance the frog can jump (can be modified)

        // Calculate the minimum energy required to reach the last stone
        int result = Frog_jump_FN(n - 1, stones, k);

        // Print the result
        System.out.println("Minimum energy required: " + result);
    }
}
