/**
 * backTracking
 */
public class backTracking {

    public static void main(String[] args) {

        boolean[][] maze = { { true, true, true },
                            { true, true, true }, 
                            { true, true, true } };
                            
        backTrackingF("", maze, 0, 0);
    }

    public static void backTrackingF(String p , boolean Maze[][],int r , int c){
       // base function 1      
	  if(r ==  Maze.length - 1 && c == Maze[0].length - 1){
        System.out.println(p);
		   return;
	   }
	   
	   if(Maze[r][c] == false){
		   return;
	   }
	   
	   Maze[r][c] = false;
	   if(r < Maze.length - 1){
		   backTrackingF(p + "D " , Maze , r+1 , c);
	   }
	     if(c < Maze[0].length - 1){
		   backTrackingF(p + "R " , Maze , r , c+1);
	   }
	     if(r > 0){
		   backTrackingF(p + "U " , Maze , r-1 , c);
	   }
	   
	     if(c > 0){
		   backTrackingF(p + "L " , Maze , r , c - 1);
	   }
	   
	   Maze[r][c] = true;  
	   /* Here, we set this to true because the subsequent 
	   recursive call must also check all rows and columns. 
	   Otherwise, it would ignore the false value, 
	   as in the previous recursive call, 
	   we marked the previous step as false. 
	   This is called backtracking. */
	   
    }
}