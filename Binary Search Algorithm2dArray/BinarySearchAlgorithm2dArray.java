import java.util.Arrays;

public class BinarySearchAlgorithm2dArray {
    public static void main(String[] args) {
        // Define the 2D array
        int arr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        // Define the target value to search for
        int target = 3;
        // Print the result of the main approach function
        System.out.println(Arrays.toString(mainAprroch(arr, target)));
    }

    // Perform a normal binary search on a row
    static int[] noramlBinerySerch(int arr[][], int row, int colS, int colE, int target) {
        while (colS <= colE) {
            // Calculate the middle column index
            int mid = colS + (colE - colS) / 2;
            // Check if the target is found
            if (target == arr[row][mid]) {
                // Return the row and column indices if target is found
                return new int[]{row, mid};
            } else if (target > arr[row][mid]) {
                // Move to the right half
                colS = mid + 1;
            } else {
                // Move to the left half
                colE = mid - 1;
            }
        }
        // Return {-1, -1} if the target is not found
        return new int[]{-1, -1};
    }

    // Main approach to search for the target in the 2D array
    static int[] mainAprroch(int arr[][], int target) {
        // Get the number of rows
        int row = arr.length;
        // Get the number of columns
        int col = arr[0].length;

        // If there is only one row, perform a normal binary search on it
        if (row == 1) {
            // Perform binary search on the single row
            return noramlBinerySerch(arr, 0, 0, col - 1, target);
        }

        // Initialize the starting and ending row pointers
        int rowStart = 0;
        // Set the ending row pointer
        int rowEnd = row - 1;
        // Calculate the middle column index
        int Cmid = col / 2;

        // Perform a binary search on the middle column to narrow down the rows
        while (rowStart < (rowEnd - 1)) {
            // Calculate the middle row index
            int mid = rowStart + (rowEnd - rowStart) / 2;
            // Check if the target is found at the middle column
            if (target == arr[mid][Cmid]) {
                // Return the indices if target is found
                return new int[]{mid, Cmid};
            } else if (target > arr[mid][Cmid]) {
                // Move the starting row pointer downwards
                rowStart = mid;
            } else {
                // Move the ending row pointer upwards
                rowEnd = mid;
            }
        }

        // Check the middle column in the remaining two rows
        // Check if the target is in the rowStart row at the middle column
        if (target == arr[rowStart][Cmid]) {
            // Return the indices if target is found
            return new int[]{rowStart, Cmid};
        }
        // Check if the target is in the rowStart + 1 row at the middle column
        if (target == arr[rowStart + 1][Cmid]) {
            // Return the indices if target is found
            return new int[]{rowStart + 1, Cmid};
        }

        // Search in the 4 quadrants based on the middle column
        // Search in the left half of the rowStart row
        if (Cmid > 0 && target <= arr[rowStart][Cmid - 1]) {  // for some cases cMid can be the start index thats why these cheak
            // Perform binary search in the left half
            return noramlBinerySerch(arr, rowStart, 0, Cmid - 1, target);
        }
        // Search in the left half of the rowStart + 1 row
        else if (Cmid>0 && target <= arr[rowStart + 1][Cmid - 1]) { 
            // Perform binary search in the left half
            return noramlBinerySerch(arr, rowStart + 1, 0, Cmid - 1, target);
        }
        // Search in the right half of the rowStart row
        else if (Cmid < (col - 1) && target >= arr[rowStart][Cmid + 1] && target <= arr[rowStart][col - 1]) { // for some cases cMid can be the last index thats why these cheak
            // Perform binary search in the right half
            return noramlBinerySerch(arr, rowStart, Cmid + 1, col - 1, target);
        }
        // Search in the right half of the rowStart + 1 row
        else {
            // Perform binary search in the right half
            return noramlBinerySerch(arr, rowStart + 1, Cmid + 1, col - 1, target);
        }
    }
}
