import java.util.Arrays;

public class countSortA {

    // Function to perform Counting Sort on the given array
    public static void coutSortFun(int[] array){
        // Edge case: If the array is null or has length <= 1, no sorting needed
        if(array == null || array.length <= 1){
            return;
        }

        // Find the maximum value in the array
        int max = array[0];
        for(int num : array){
            if(num >  max){
                max = num;
            }
        }

        // Create a count array to store the frequency of each number
        int[] countArray =  new int[max + 1];

        // Count the frequency of each element in the original array
        for (int num : array){
            countArray[num]++;
        }

        // Reconstruct the sorted array using the count array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0){
                array[index] = i;  // Place the number in the sorted array
                index++;  // Move to the next index in the array
                countArray[i]--;  // Decrease the count of the current number
            }
        }
    }

    public static void main(String[] args) {
        // Sample input array
        int[] arr = {4 , 6 , 6 , 1 , 2 , 3};

        // Calling the Counting Sort function
        coutSortFun(arr);

        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
/*
* Time Complexity:
Finding the maximum value: O(n), where n is the length of the array. We traverse through the entire array once to find the maximum value.
Counting the frequency of each number: O(n), as we traverse the array once again.
Rebuilding the sorted array: O(n + k), where n is the length of the array and k is the range of the elements (i.e., max value in the array). This step involves iterating through the count array and inserting values into the original array.
Overall time complexity is: O(n + k), where n is the size of the array and k is the maximum value in the array.

Space Complexity:
Auxiliary count array: O(k), where k is the range of the elements (i.e., max element in the array).
Auxiliary space for the input array: O(n), where n is the length of the input array.
Overall space complexity is: O(n + k).
*
*
* */