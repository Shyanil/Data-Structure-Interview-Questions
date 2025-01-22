import java.util.List;
import java.util.ArrayList;
public class missingdoubleNumber {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        missingdoubleNumber instance = new missingdoubleNumber();
        List<Integer> missingNumbers = instance.findDisappearedNumbers(arr);
        
        System.out.println("Missing numbers: " + missingNumbers);
        
    }
       public List<Integer> findDisappearedNumbers(int[] arr) {
		   int i = 0;
		   while(i < arr.length){
			   int currIndex= arr[i] - 1;
			   if(arr[i] != arr[currIndex]){
				   swap ( arr, i , currIndex);
			   } else {
				   i++;
			   }
		   }
		   List<Integer> ans = new ArrayList<>();
		   for(int j = 0 ; j < arr.length ; j++){
			   if(arr[j] != j+1){ // here works 4 must be in 5 index
				   ans.add(j+1);
			   }
		   }
		   return ans;
	   }
       public static void swap(int arr[], int a , int e){
		int temp= arr[a];
		arr[a] = arr[e];
		arr[e] = temp;
	}
       
}
