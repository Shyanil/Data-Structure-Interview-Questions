import java.util.Arrays;

public class cycleSort  {
public static void main(String[] args) {
		int arr[]= {4,2,3,1};
		sort(arr);
	  System.out.println(Arrays.toString(arr));

	}
static void sort(int arr[]){
	int i = 0 ;
		int correntNo = arr[i] - 1;
		if(arr[i] != arr[correntNo]){
			swap(arr , i , correntNo);
		} else{
		  i++;
		}
	}

static void swap(int arr[], int start , int end ){

	int temp = arr[start];
	arr[start]= arr[end];
	arr[end] = temp;
}
}
