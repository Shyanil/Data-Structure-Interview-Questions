import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * MazeStepBackTracking
 */
public class MazeStepBackTracking {

    public static void main(String[] args) {
        boolean Maze [][] = {{true , true , true},
                             {true , true , true},
                             {true , true , true}};

        int path[][] = new int[Maze.length][Maze[0].length];
          theHelper("" , Maze , 0 , 0 , path , 1);
    }

    public static void theHelper(String p , boolean Maze[][] , int r , int c , int[][] path , int step){
        if(r == Maze.length - 1 && c == Maze[r].length - 1){
			path[r][c] = step;
			for(int arr[] : path){
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
            System.out.println();
			return;
		}
		if(Maze[r][c] == false){
			return;
		}
		Maze[r][c] = false;
		path[r][c] = step;
		if(r < Maze.length - 1 ){
			theHelper(p + "D " , Maze , r + 1 , c , path , step + 1);
		}
		if(c < Maze[r].length - 1 ){
			theHelper(p + "R " , Maze , r , c + 1 , path , step + 1);
		}
		if(r > 0){
			theHelper(p + "U " , Maze , r -1 , c, path , step + 1);
		}
		if(c > 0){
			theHelper(p + "U " , Maze , r , c - 1, path , step + 1);
		}
		Maze[r][c] = true;
		path[r][c] = 0;
    }
}