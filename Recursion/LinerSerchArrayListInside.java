import java.util.ArrayList;

/**
 * LinerSerchArrayListInside
 */
public class LinerSerchArrayListInside {
   public static void main(String[] args) {
    int arr[]= {2,3,4,5,6,7,8,9,10,11,20,10};
    System.out.println(InsideFunction(arr, 10, 0));

   }
   public static ArrayList<Integer> InsideFunction(int arr[], int target , int index){
    ArrayList<Integer> list =  new ArrayList<>();
     if(index == arr.length){
		 return list;
	 }

	 if(arr[index] == target){
		 list.add(index);
	 }
	 ArrayList<Integer> allIndex = InsideFunction(arr,target,index+1);
	 list.addAll(allIndex);
	 return list;
		 
   }
    
}