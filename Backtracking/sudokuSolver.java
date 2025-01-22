/**
 * sudokuSolver
 */
public class sudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
     
          solveSudoku(board);
        
        // Print the solved Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
     // https://chatgpt.com/share/25aba037-6166-4dfb-add1-77fa678271ac
    public static void solveSudoku(char[][] board) {
		int intarr[][] = new int [9][9];
		for(int i = 0; i< 9 ; i++){
			for(int j = 0 ; j < 9 ;j++){
				if(board[i][j] == '.'){
					intarr[i][j] = 0;
				} else {
					intarr[i][j] = board[i][j] - '0';
				}
			}
		}
		solveSudokuHelper(intarr);
			for(int i = 0; i< 9 ; i++){
			    for(int j = 0 ; j < 9 ;j++){
			    board[i][j] = (intarr[i][j] == 0) ? '.' : (char) (intarr[i][j] + '0');
			}
			}
	}

     public static boolean solveSudokuHelper(int [][]board){
		 int n  = board.length;
		 int row = -1;
		 int col = - 1;
		 
		 boolean allL = true;
		 
		 for(int i = 0 ; i < n ; i++){
			 for(int j = 0 ;j < n ;j++){
				 if(board[i][j] == 0){
					 row = i;
					 col = j;
					 allL = false;
					 break;
				 }
			 }
			 if(!allL){
				 break;
			 }
		 }
		 
		 if(allL){
			 return true;
		 }
		 
		 for(int num = 1 ; num <= 9 ; num++){
			 if(isSafe(board , row , col , num)){
				 board[row][col] = num;
				 if(solveSudokuHelper(board)){
				   return true;
				 }else {
					 board[row][col] = 0;
				 } 
			 }
		 }
		 return false;
		 
	 }

     public static boolean isSafe(int board[][] , int row , int col , int num){
		 for(int i = 0 ; i < board[row].length ; i++){
			 if(board[row][i] == num){
				 return false;
			 }
		 }
		 
		 for(int colG[]: board){
			 if(colG[col] == num){
				 return false;
			 }
		 }
		 
		 int sqrt = (int) Math.sqrt(board.length);
		 int rowS = row - row % sqrt;
		 int colS = col - col % sqrt;
		 
		 for(int i = rowS ; i < rowS + sqrt ; i++){
			 for(int j = colS ; j < colS + sqrt ; j++){
				 if(board[i][j] == num){
					 return false;
				 }
			 }
		 }
            return true;		 
		 
	 }

}