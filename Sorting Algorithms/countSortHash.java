import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countSortHash {

    // Count Sort function using HashMap
    public static void coutSortFun(int[] array) {
        // Check if the array is null or has one or fewer elements
        // Time Complexity: O(1) (constant check)
        if (array == null || array.length <= 1) {
            return;
        }

        // Find the maximum and minimum values in the array
        // Time Complexity: O(n) for both max and min (n is the size of the array)
        int max = Arrays.stream(array).max().getAsInt(); // O(n)
        int min = Arrays.stream(array).min().getAsInt(); // O(n)

        // Create a map to store the frequency of each element
        // Space Complexity: O(k), where k is the number of unique elements in the array
        Map<Integer, Integer> map = new HashMap<>();

        // Populate the map with the frequency of each number
        // Time Complexity: O(n), where n is the size of the array
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1); // O(1) per operation, overall O(n)
        }

        // Index to place sorted elements back into the array
        int index = 0;

        // Iterate through the range from min to max
        // Time Complexity: O(k), where k is the range from min to max
        for (int i = min; i <= max; i++) {
            // Get the frequency count of the current number, or 0 if not found
            int count = map.getOrDefault(i, 0); // O(1) per operation

            // Place the current number 'count' times in the array
            // Time Complexity: O(count), the inner loop runs 'count' times
            for (int j = 0; j < count; j++) {
                array[index] = i; // O(1) per assignment
                index++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        coutSortFun(arr);
        // Print the sorted array
        System.out.println(Arrays.toString(arr)); // O(n)
    }
}

/*
*
* Overall Time Complexity: O(n + k), where n is the number of elements in the array, and k is the range of values from min to max. In the worst case, if the range is large, the time complexity will be dominated by k.
Space Complexity:
Map storage: O(k) where k is the number of unique elements in the array (size of the map).
Array: O(n) for storing the input array and the sorted output.
Overall Space Complexity: O(n + k)
*  */