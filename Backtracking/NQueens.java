/**
 * N-Queens
 */
public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean arr[][] = new boolean[n][n];
        int count = NqueenF(arr , 0);
        System.out.println(count);
    }
    // Just Do it with kunal video and - https://chatgpt.com/c/66dfe6bf-1534-8013-bb04-6f5ae5224e14  ( Dad account)
   
    public static int NqueenF(boolean arr[][] , int row){
		if(row == arr.length){
			displayF(arr);
			return 1;
		}
		
		int count = 0;
		for(int col = 0 ; col < arr[row].length; col++){
			if(isSafe(arr , row , col)){
				arr[row][col] = true;
				count+= NqueenF(arr , row + 1);
				arr[row][col] = false;
			}
		}
		return count;
	}


    public static void displayF(boolean arr[][]){
		for(boolean row[] : arr){
			for(boolean elemnent : row){
				if(elemnent){
					System.out.print("Q ");
				}
				else {
				    System.out.print(". ");	
				}
                
			}
            System.out.println();
		}
        System.out.println();
	}

    public static boolean isSafe(boolean arr[][] , int row , int col){
		// vertical row check
		for(int i = 0 ; i < row ; i++){
			if(arr[i][col] == true){
				return false;
			}
		}
		// left horizontal
         int maxLeft = Math.min(row , col);	
		for(int i = 1 ; i <= maxLeft ; i++){
			if(arr[row - i][col - i]){
				return false;
			}
		}
		
		// right horizontal
         int maxRight = Math.min(row , arr . length - 1 - col);	
		for(int i = 1 ; i <= maxRight ; i++){
			if(arr[row - i][col + i]){
				return false;
			}
		}
		return true;
	}
}