/**
 * theKnight
 */
public class theKnight {

    public static void main(String[] args) {
        boolean arr[][] = new boolean[4][4];
        theKnightF(arr , 0 , 0 , 4);
    }

     // https://chatgpt.com/share/873bcfba-043e-4f75-be80-cc47511b7a7b
    public static void theKnightF(boolean arr[][] , int row , int col , int knights){
		if(knights == 0){
			display(arr);
			System.out.println();
			return;
		}
        if(row == arr .length - 1 && col == arr[row].length){
            return;
        }
		if(col == arr[row].length){
			theKnightF(arr , row + 1 , 0 , knights);
            return;
            
		}
		if(isSafe(arr , row , col)){
			arr[row][col] = true;
			theKnightF(arr , row , col + 1 , knights - 1);
			arr[row][col] = false;
		}
		
		theKnightF(arr , row , col + 1 , knights);
	}


    public static void display(boolean arr[][]){
		for(boolean ele[] : arr){
			for(boolean el : ele){
				if(el){
				System.out.print("k ");
				} else {
                System.out.print(". ");
                }
			}
            System.out.println();
		}
        System.out.println();
	}

    public static boolean isSafe(boolean arr[][] , int row , int col){
		if(isValid(arr , row - 1 , col + 2)){
			if(arr[row - 1][col + 2]){
				return false;
			}
        }
		if(isValid(arr , row - 1 , col - 2)){
			if(arr[row - 1][col- 2]){
				return false;
			}
        }
		if(isValid(arr , row - 2 , col + 1)){
			if(arr[row - 2][col + 1]){
				return false;
			}

        }
		if(isValid(arr , row - 2 , col - 1)){
			if(arr[row - 2][col - 1]){
				return false;
			}
        }
		return true;
		
	}

    public static boolean isValid(boolean arr[][] , int row , int col){
		if(row >= 0 && col < arr.length && col >= 0 && col <arr[row].length){
			return true;
		}
		return false;
	}
}


