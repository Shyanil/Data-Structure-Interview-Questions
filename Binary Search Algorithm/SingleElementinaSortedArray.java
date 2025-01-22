/**
 * SingleElementinaSortedArray
 */
public class SingleElementinaSortedArray {

    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);

        
    }
    public static int singleNonDuplicate(int[] arr) {
	  if(arr.length == 1){
		  return arr[0];
	  }
	  if(arr[0] != arr[1]){
		  return arr[0];
	  }
	  if(arr[arr.length - 1] != arr[arr.length - 2]){
		  return arr[arr.length - 1];
	  }
      int start = 1 ;
      int end = arr.length - 2;	  
	  while(start <= end){
		  int mid = start + (end  - start) / 2;
		  if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){ // when this two side not equal ans is found
			  return arr[mid];
		  }
		  if((mid % 2 == 0 && arr[mid] == arr[mid+1] ) || (mid % 2 !=0 && arr[mid] == arr[mid-1])){
			  start = mid + 1;
		  } else {
			  end = mid - 1;
		  }
	  }
	  return -1;
    }
}