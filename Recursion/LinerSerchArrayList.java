import java.lang.reflect.Array;
import java.util.*;

public class LinerSerchArrayList{

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5,5, 4,5};
        System.out.println(returnArrayList(arr, 5, 0, new ArrayList<>()));

    }
    public static ArrayList<Integer> returnArrayList(int arr[], int target , int index , ArrayList<Integer> list){
       if(index == arr.length){
	     return list;
	   }		  
      if(arr[index] == target){
		  list.add(index);
	  }
     return returnArrayList(arr,target,index+1,list);	  
    }
}