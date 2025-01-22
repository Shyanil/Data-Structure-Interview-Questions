import java.util.Arrays;

public class SeclectionSort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        System.out.println("Before Selection Sort");
        System.out.println(Arrays.toString(arr));

        System.out.println("After Selection Sort");
        SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
    }
    public static void SelectionSort(int arr[]){
        for(int i = 0; i< arr.length ; i++){
            int last = arr.length - i - 1;
			int maxIndexs = maxIndex(arr , 0 , last);
			swap(arr,maxIndexs , last);
        }
		 
    }
	public static void swap(int arr[], int start , int end){
		int temp = arr[start] ; 
		arr[start] = arr[end] ; 
		arr[end] = temp ; 
	}
	public static int maxIndex(int arr[], int start , int end){
	   int max = start ;
	   for(int i = start ; i <= end ; i++){  // i have to last of element thats why you have to = / alsoe we can do end + 1
		   if(arr[max] < arr[i]){  // i must use arr inside of array then compere because then and then i compering the elements if i only write mx or i its comer only index
			   max = i;
		   }
	   }
	   return max;
	}
}
