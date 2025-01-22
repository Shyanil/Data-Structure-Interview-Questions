
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[]= {-30,-1,-4830,10,30,40,2,0,3,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
	 for(int i = 0 ; i < arr.length - 1 ; i++){  // actually here i goes to arr.length - 2 but i remove less equal to thats why
		 for(int j = i+1 ; j > 0; j--){  // j actually checking and swap j start from where i ends in first case i end in 1 index and j start 
			if(arr[j] < arr[j-1]){
				swap(arr, j , j-1);
			}  else {
				break;
			}
			 
		 } 
	 }	
		
	}
	
	public static void swap(int arr[], int start , int end){
		int temp = arr[start];
		arr[start] = arr[end] ;
		arr[end] = temp;
	}
}