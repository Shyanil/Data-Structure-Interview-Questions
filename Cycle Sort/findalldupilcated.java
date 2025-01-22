import java.util.*;;
public class findalldupilcated {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println("Duplicate numbers: " + ans);
    }
     public static List<Integer> findDuplicates(int[] arr) {
        int i = 0 ;
		while(i < arr.length) {
			int  cuurIndex = arr[i] - 1;
			if(arr[i] != arr[cuurIndex] ) {
				swap(arr, i , cuurIndex);
			} else {
			  i++;
			}
		}
		List<Integer> ans = new ArrayList<Integer>();
		for(int k = 0 ; k < arr.length ; k++){
			if(arr[k] != k+1){  // here its cheaks for wrong index array or duplicate number  // beacuse one duplicate number is right index other is not
				ans.add(arr[k]);
			}
		}
		return ans;
     }

      public static void swap(int arr[], int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
