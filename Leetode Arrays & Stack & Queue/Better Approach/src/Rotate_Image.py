class Solution(object):
    def rotate(self, matrix):
        """
        Rotates the given n x n 2D matrix 90 degrees clockwise in-place.
        
        :type matrix: List[List[int]]
        :rtype: None. The matrix is modified in-place.
        """
        n = len(matrix)  # Get the size of the matrix (number of rows or columns)
        
        # Step 1: Transpose the matrix (swap rows with columns)
        for i in range(n):
            for j in range(i):  # Iterate only over the upper triangle of the matrix
                # Swap the elements at position (i, j) with (j, i)
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        
        # Step 2: Reverse each row to complete the 90-degree rotation
        for i in range(n):
            matrix[i].reverse()  # Reverse the current row
