import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};  // Input array

        // Call the method to find all triplets that sum to 0
        List<List<Integer>> ans = threeSum(arr);

        // Print the resulting triplets
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        // Set to avoid duplicate triplets
        Set<List<Integer>> listSet = new HashSet<>();

        // Iterate through all possible combinations of three numbers in the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // If the sum of the triplet is 0, process it
                    if(arr[i] + arr[j] + arr[k] == 0){
                        // Create a list with the current triplet of numbers
                        List<Integer> integers = Arrays.asList(arr[i], arr[j], arr[k]);

                        // Sort the triplet to handle duplicate triplets in different orders
                        integers.sort(null);  /* {Inside this: sorts the triplet in ascending order to handle duplicates
                                                 and ensure consistency in triplet representation.} */

                        // Add the sorted triplet to the HashSet to avoid duplicates
                        listSet.add(integers);
                    }
                }
            }
        }

        // Convert the set of unique triplets to a list and return it
        return new ArrayList<>(listSet);
    }
}



/*
    Time Complexity:
    - The algorithm uses three nested loops to check all possible triplets, which results in a time complexity of O(n^3).
    - For each combination of three elements, the algorithm checks if their sum is zero.
    - Sorting each triplet takes O(1) time since each triplet has only 3 elements.
    - The overall time complexity is dominated by the nested loops, so it's O(n^3), where 'n' is the length of the input array.

    Space Complexity:
    - We store the unique triplets in a HashSet to avoid duplicates, and each triplet contains three integers.
    - The worst-case space required to store all triplets is O(k), where k is the number of unique triplets.
    - Therefore, the space complexity is O(k), where 'k' is the number of unique triplets.
*/

