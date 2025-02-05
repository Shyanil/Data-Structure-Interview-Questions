import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};  // Input array

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

        // Iterate through the array to find pairs that sum to a negative value of the current element
        for (int i = 0; i < arr.length; i++) {
            // Use a set to keep track of the second number in the pair for the current first number
            Set<Integer> integerSet = new HashSet<>();

            // Iterate through all subsequent elements to find pairs
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);  // Calculate the third number to make the sum zero

                // Check if the third number is already seen in the set
                 if (integerSet.contains(third)) {
                    if (arr[i] + arr[j] + third == 0) {
                        // Create a sorted triplet to ensure no duplicate triplets are added
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                        temp.sort(null);  /* {Inside this: sorts the triplet in ascending order to handle duplicates
                                             and ensure consistency in triplet representation.} */

                        // Add the triplet to the set
                        listSet.add(temp);
                    }
                }

                // Add the current second number to the set for future checks
                integerSet.add(arr[j]);
            }
        }

        // Convert the set of unique triplets to a list and return it
        return new ArrayList<>(listSet);
    }
}


/*
    Time Complexity:
    - The outer loop iterates through each element in the array, resulting in O(n) iterations.
    - The inner loop iterates through the remaining elements to find the second element of the pair, which gives O(n) iterations.
    - For each pair (arr[i], arr[j]), we check if the third element exists in the `integerSet` in constant time O(1) using the hash set.
    - Sorting the triplet takes O(1) time because there are only three numbers in each triplet.
    - The overall time complexity is O(n^2), where `n` is the length of the array.

    Space Complexity:
    - We store the unique triplets in a `HashSet` to avoid duplicates, and each triplet contains three integers.
    - The worst-case space required to store all triplets is O(k), where `k` is the number of unique triplets.
    - Additionally, we use a `HashSet` to store the second number in the pair, which takes O(n) space in the worst case.
    - Therefore, the space complexity is O(n + k), where `n` is the number of elements and `k` is the number of unique triplets.
*/
