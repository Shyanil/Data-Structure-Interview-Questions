import java.util.Arrays;

public class twoDBinarySerch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };

        System.out.println("Searching for 5: " + Arrays.toString(binary2D(matrix, 5)));
        System.out.println("Searching for -2: " + Arrays.toString(binary2D(matrix, -2)));
    }

    public static int[] binary2D(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // For single row matrix
        if (rows == 1) {
            return binarySearchRow(matrix[0], target, 0);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (cMid > 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearchRow(matrix[rStart], target, rStart);
        }
        // search in 2nd half
        if (cMid < cols - 1 && target >= matrix[rStart][cMid + 1]) {
            return binarySearchRow(matrix[rStart], target, rStart);
        }
        // search in 3rd half
        if (cMid > 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearchRow(matrix[rStart + 1], target, rStart + 1);
        }
        // search in 4th half
        if (cMid < cols - 1 && target >= matrix[rStart + 1][cMid + 1]) {
            return binarySearchRow(matrix[rStart + 1], target, rStart + 1);
        }

        return new int[]{-1, -1};
    }

    private static int[] binarySearchRow(int[] row, int target, int rowNum) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] == target) {
                return new int[]{rowNum, mid};
            }

            if (row[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}