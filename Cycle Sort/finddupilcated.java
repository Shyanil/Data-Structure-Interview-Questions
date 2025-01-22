import java.util.Arrays;

public class finddupilcated {
    //https://leetcode.com/problems/find-the-duplicate-number/description/
    public static void main(String[] args) {
        int arr[] = {3,1,3,4,2};

        System.out.println(findDuplicate(arr));
        
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
		while(i < arr.length ){
            // these down conditopn only works for the one item if i want t find
			if(arr[i] != i+1){ // checks the item is equal to the index + 1  beacuse 1to n array thats if dont match then we have to and swap
			int currentI = arr[i] - 1 ; // finding the index element
			 if(arr[i] != arr[currentI]){  // cheaking the index
				 swap(arr , i , currentI);  // then i have to swap with the index
			 } else {
			   return arr[i];  // if they dont macth means wrong index then return the number itsleft
			 }
			}
			else {
				i++; // or curser ++
			}
		}
		return -1;
		

    }
    public static void swap(int arr[], int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
