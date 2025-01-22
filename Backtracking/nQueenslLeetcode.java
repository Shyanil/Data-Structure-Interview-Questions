import java.util.ArrayList;
import java.util.List;

/**
 * nQueenslLeetcode
 */
public class nQueenslLeetcode {
    public static void main(String[] args) {

        nQueenslLeetcode obj = new nQueenslLeetcode();
        System.out.println(obj.solveNQueens(4));
        
    }

    public List<List<String>> solveNQueens(int n) {
        boolean arr[][] = new boolean[n][n];
        List<List<String>> ans = new ArrayList();
        solveNQueensH(arr , 0 , ans);
        return ans;                                                                                
        
    }
    public void solveNQueensH(boolean arr[][] , int row , List<List<String>> list){
        if(row == arr.length){
            list.add(printsolveNQueens(arr));
            return;
        }

        for(int col = 0 ; col < arr[row].length ; col++){
            if(isSafe(arr , row , col)){
                arr[row][col] = true;
                solveNQueensH(arr , row + 1 , list);
                arr[row][col] = false;
            }
        }
    }
    public List<String> printsolveNQueens(boolean arr[][]){
        List<String> ans = new ArrayList<>();
        for(boolean elements[] : arr){
          StringBuilder sb = new StringBuilder();
          for(boolean element : elements){
              sb.append(element ? "Q" : '.');
          }
          ans.add(sb.toString());
        }
        return ans;
    }
    public boolean isSafe(boolean arr[][] , int row , int col){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i][col]){
                return false;
            }
        }
        int leftH = Math.min(row , col);
        for(int i = 1; i <=leftH ;i++){
            if(arr[row - i][col - i]){
                return false;
            }
        }
        int rightH = Math.min(row , arr.length - 1 - col);
          for(int i = 1; i <=rightH ;i++){
            if(arr[row - i][col + i]){
                return false;
            }
        }
        return true;
    }
}