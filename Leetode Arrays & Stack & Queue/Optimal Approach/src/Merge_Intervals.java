import java.util.ArrayList; // Import for dynamic array
import java.util.Arrays; // Import for array utilities
import java.util.List; // Import for List interface

public class Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        // Check if the input is empty, return an empty 2D array. O(1)
        if(intervals.length == 0){
            return new int[0][0]; // O(1) space
        }

        // Sort the intervals by their start times. O(n log n)
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Create a list to store merged intervals. O(1) initialization
        List<int[]> intV = new ArrayList<>();

        // Start with the first interval as the current interval. O(1)
        int[] curr = intervals[0];

        // Iterate through the remaining intervals. O(n)
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i]; // Access the next interval. O(1)

            // Check if intervals overlap. O(1)
            if(next[0] <= curr[1]){
                // Merge intervals by extending the end of the current interval. O(1)
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                // Add the current interval to the list. O(1) amortized for ArrayList
                intV.add(curr);
                // Move to the next interval. O(1)
                curr = next;
            }
        }

        // Add the last interval. O(1)
        intV.add(curr);

        // Convert the list back to a 2D array. O(n)
        return intV.toArray(new int[intV.size()][]);
    }

    public static void main(String[] args) {
        // Example intervals for testing
        int[][] intervals = {{1, 3}, {2, 4}, {6, 8}, {7, 10}};

        // Call the merge method. O(n log n)
        int[][] mergedIntervals = merge(intervals);

        // Print the merged intervals. O(n)
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval)); // O(k) for each interval (k = interval size)
        }
    }
}




/*  



### Complexity Analysis:

1. **Time Complexity**:
   - Sorting the intervals: \( O(n \log n) \), where \( n \) is the number of intervals.
   - Iterating through intervals to merge: \( O(n) \).
   - Total: \( O(n \log n) \).

2. **Space Complexity**:
   - Sorting in-place: \( O(1) \) additional space.
   - Storing merged intervals in a list: \( O(n) \) for the worst case when no intervals merge.
   - Converting list to array: \( O(n) \).
   - Total: \( O(n) \).



 */