import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());


        // Loop through each number in the input array
        for (int num : nums) {

            int size = outer.size(); // Get the current size of the outer list
            // Generate new subsets by adding the current number to existing subsets
            for (int i = 0; i < size; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // Copy the existing subset
                inner.add(num); // Add the current number
                outer.add(inner); // Add the new subset to the outer list
            }
        }
        return outer; // Return all subsets
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Input array
        List<List<Integer>> result = subsets(nums); // Generate subsets
        
        // Print the result
        System.out.println(result);
    }
}
