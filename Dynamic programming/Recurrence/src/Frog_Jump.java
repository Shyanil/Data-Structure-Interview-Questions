public class Frog_Jump {
    public static int Frog_jump_FN(int index, int[] stones) {
        if (index == 0) {
            return 0;
        }

        // Fixing the syntax for Math.abs and closing parentheses
        int left = Frog_jump_FN(index - 1, stones) + Math.abs(stones[index] - stones[index - 1]);

        int right = Integer.MAX_VALUE; // Set to a large value by default
        if (index > 1) {
            right = Frog_jump_FN(index - 2, stones) + Math.abs(stones[index] - stones[index - 2]);
        }

        return Math.min(left, right);
    }

    public static void main(String[] args) {
        // Example usage of the Frog_jump_FN method
        int[] stones = {10, 30, 40, 20};  // Sample input
        System.out.println(Frog_jump_FN(stones.length - 1, stones));  // Call for the last stone
    }
}
