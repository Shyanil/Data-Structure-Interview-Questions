import java.util.List;

public class Triangle_list {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Get the number of rows in the triangle
        int t = triangle.size();
        // DP arrays to store the minimum path sums for the current and previous row
        int[] font = new int[t];
        int[] curr = new int[t];

        // Initialize the front array with the values from the bottom row of the triangle
        for (int i = 0; i < t; i++) {
            font[i] = triangle.get(t - 1).get(i);
        }

        // Start from the second last row and move upwards
        for (int i = t - 2; i >= 0; i--) {
            // Process each element in the current row
            for (int j = i; j >= 0; j--) {
                // Calculate the two possible path sums: down and diagonal
                int down = triangle.get(i).get(j) + font[j];
                int diagonal = triangle.get(i).get(j) + font[j + 1];
                // Choose the minimum path sum and store it in curr array
                curr[j] = Math.min(down, diagonal);
            }
            // Update the front array to be the current array for the next iteration
            font = curr.clone();
        }

        // The result is the minimum path sum at the top of the triangle
        return font[0];
    }

    // Time Complexity: O(t^2) where t is the number of rows. We process each element once.
    // Space Complexity: O(t) as we use two arrays of size t.
}
