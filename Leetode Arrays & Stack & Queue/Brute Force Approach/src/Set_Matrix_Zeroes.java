public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    rowsetFun(i , matrix);
                    colsetFun(j , matrix);
                }
            }
        }

       reStructure(matrix);
    }



    private void colsetFun(int j , int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] !=0){
                matrix[i][j] = -1;
            }
        }
    }

    private void rowsetFun(int i, int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    private void reStructure(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
