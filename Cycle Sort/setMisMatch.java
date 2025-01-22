
import java.util.Arrays;

public class setMisMatch {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        System.out.println((Arrays.toString(findErrorNums(arr))));
    }

    public static int[] findErrorNums(int[] nums) {
		int i = 0;
		while(i < nums.length ){
			int cuurIndex = nums[i] - 1;
			if(nums[i] !=nums[cuurIndex]){
				swap(nums , i , cuurIndex);
			} else {
				i++;
			}
		}
		
	
		for(int k = 0 ; k < nums.length ; k++){
			if(nums[k] != k+1){
			     return new int[]{ nums[k] , k+1}; 
			}
		}
        return new int[]{-1,-1};
	  
	}
    public static void swap(int arr[], int a , int e){
		int temp= arr[a];
		arr[a] = arr[e];
		arr[e] = temp;
	}
    
}
