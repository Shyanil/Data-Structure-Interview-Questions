import java.sql.Array;
import java.util.Arrays;

/**
 * quickSort
 */
public class quickSort {

    public static void main(String[] args) {

        int arr[] = { 10, 7, 8, 9, 1, 5 };

        quickSortMethord(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


        
    }

    public static void quickSortMethord(int arr[] , int low , int hi){
        if(low >= hi){
			return;
		}
		int Start = low;
		int End = hi;
		int mid = Start + (End - Start)/2;
		int piviot = arr[mid];
		
		while(Start <= End){
			if(arr[Start] < piviot){
				Start++;
			}
			if(arr[End] >  piviot){
				End--;
			}
		   if(Start <= End){
			   int temp = arr[Start];
			   arr[Start] = arr[End];
			   arr[End] = temp;
			   Start++;
			   End--;
		   }
		
		}
        //recursive call
		quickSortMethord(arr, low, End);
        quickSortMethord(arr, Start, hi);

    }
}