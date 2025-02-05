public class Maximum_Path_Sum_in_the_matrix {

        // Function to find the maximum path sum in the matrix using recursion
        static int getMaxUtil(int i, int j, int m, int[][] matrix) {
            // Base Conditions
            if (j < 0 || j >= m)
                return (int) Math.pow(-10, 9);
            if (i == 0)
                return matrix[0][j];

            // Calculate three possible paths: moving up, left diagonal, and right diagonal
            int up = matrix[i][j] + getMaxUtil(i - 1, j, m, matrix);
            int leftDiagonal = matrix[i][j] + getMaxUtil(i - 1, j - 1, m, matrix);
            int rightDiagonal = matrix[i][j] + getMaxUtil(i - 1, j + 1, m, matrix);

            // Return the maximum of the three paths
            return Math.max(up, Math.max(leftDiagonal, rightDiagonal));
        }

        // Function to find the maximum path sum in the matrix
        static int getMaxPathSum(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;

            int maxi = Integer.MIN_VALUE;

            // For each starting column, find the maximum path sum and update maxi
            for (int j = 0; j < m; j++) {
                int ans = getMaxUtil(n - 1, j, m, matrix);
                maxi = Math.max(maxi, ans);
            }

            return maxi;
        }

        public static void main(String args[]) {
            int matrix[][] = {{1, 2, 10, 4},
                    {100, 3, 2, 1},
                    {1, 1, 20, 2},
                    {1, 2, 2, 1}};

            // Call the getMaxPathSum function and print the result
            System.out.println(getMaxPathSum(matrix));
        }
    }

