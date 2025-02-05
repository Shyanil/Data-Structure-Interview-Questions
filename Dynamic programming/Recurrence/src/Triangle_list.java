import java.util.*;
public class Triangle_list {
//    https://leetcode.com/problems/triangle/
    public int minimumTotal(List<List<Integer>> triangle) {
      int m = triangle.size();
      return minimumTotalH(triangle , m , 0 ,0 );
    }

    private int minimumTotalH(List<List<Integer>> triangle, int m, int i, int j) {
        if(i == m - 1) return triangle.get(i).get(j);
        int down = triangle.get(i).get(j) + minimumTotalH(triangle , m , i + 1 , j);
        int diagonal = triangle.get(i).get(j) + minimumTotalH(triangle , m , i + 1 , j + 1);
        return Math.min(down , diagonal);
    }


}
