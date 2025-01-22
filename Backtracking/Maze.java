import java.util.*;
/**
 * Maze
 */
public class Maze {
     // Not Backtracking 
    public static void main(String[] args) {
        // System.out.println(printMazeCount(3, 3));
        // pathsMaze("", 3, 3);
		// System.out.println(pathsMazeList("", 3, 3));

		 boolean[][] maze = { { true, true, true },
		                      { true, false, true }, 
							  { true, true, true } };
		pathsMazObstacles("", maze, 0, 0);
    }

    public static int printMazeCount(int r, int c) {
		
		if(r == 1 || c == 1){
			return 1;
		}
		
		int left = printMazeCount(r-1 , c);
		int righ = printMazeCount(r , c -1);
		
		return left + righ;
	}
    public static void pathsMaze(String p , int r , int c){
        if(r == 1 && c == 1){
            System.out.println(p);
			return;
		}
		if(r > 1){
			pathsMaze(p + "Down -->" , r-1 , c);
		}
		if(c > 1){
			pathsMaze(p + "Right -->" , r , c-1);
		}
    }
	public static List<String> pathsMazeList(String p , int r , int c){
		if(r==1 && c==1){
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		List<String> listAll = new ArrayList<>();
		if(r > 1 && c > 1){  // you can't go diagonally if you last Colum or last row
			listAll.addAll(pathsMazeList(p+ "Diagonal " , r-1 , c-1));
		}
		if(r > 1){
			listAll.addAll(pathsMazeList(p+ "Down " , r-1 , c)); 
		}
		if(c > 1){
			listAll.addAll(pathsMazeList(p+ "Right " , r , c-1));
		}
		return listAll;
	}

	public static void  pathsMazObstacles(String p , boolean[][] Maze , int row , int col){
		if(row == Maze.length - 1 && col == Maze[0].length - 1){
			System.out.println(p);
			return;
		}
		if(Maze[row][col] == false){
			return;
		}
		
		if(row < Maze.length - 1){
			pathsMazObstacles(p + "D " , Maze , row + 1 , col);
		}
		
		if(col < Maze[0].length - 1){ // simple word you forget watch array video from 56:00 mints
             // every row is start from 0 and every row is a array and Colum goes the size of the rows and we increment + 1 always thats why we start from 0
			pathsMazObstacles(p + "R " , Maze , row  , col + 1);
		}
	}
}