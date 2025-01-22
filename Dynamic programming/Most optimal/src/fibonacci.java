public class fibonacci {
    public static void main(String[] args) {
        int n = 12;
        int prev1 = 1;
        int prev2 = 0;

        // Time complexity: O(n) - The loop runs 'n-2' times (since we start from i=2)
        // Space complexity: O(1) - Only a constant amount of space is used, regardless of the input size
        for (int i = 2; i <= n; i++) {
            int curri = prev1 + prev2;
            prev2 = prev1;
            prev1 = curri;
        }

        System.out.println(prev1);
    }
}
