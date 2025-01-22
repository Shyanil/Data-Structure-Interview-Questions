public class NthMagical {
    public static void main(String[] args) {
        int n = 3;  // Change this value to test different numbers
        int base = 5;
        int ans = 0;
        while (n > 0) {
            int lastBin = n & 1;   // Get the last binary bit
            ans += lastBin * base; // Add the base value if the last binary bit is 1
            base = base * 5;      // Multiply base by 5 for the next iteration
            n = n >> 1;           // Right shift `n`
        }
        System.err.println(ans); // Output the final result
    }
}
//  complexity = log n 

// for better understand please follow last chat- https://chatgpt.com/share/44c1b283-6b13-4fdb-b74d-0ca867495e8c