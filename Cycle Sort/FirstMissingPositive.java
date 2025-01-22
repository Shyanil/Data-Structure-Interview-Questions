public class FirstMissingPositive {
 public static void main(String[] args) {

    int arr[] = { 3, 4, -1, 1 };
    int ans = firstMissingPositive(arr);
    System.out.println(ans);
    
 }

 public static int firstMissingPositive(int[] arr) {
	 int i = 0;
	 while(i < arr.length ) {
		 int curIndex = arr[i] - 1;
		 if(arr[i] > 0 && arr[i] <=arr.length && arr[i] != arr[curIndex]){  // here ignore the nagative and must be values  of arr[i] less then arr.length
			 swap(arr,i,curIndex);
		 } else{
		   i++;
		 }
	 }
	 for(int k = 0 ; k < arr.length ; k++){
		 if(arr[k] !=k+1){
			 return k+1;   // return the index means the number is missing
		 }
	 }
	 return arr.length + 1;
 }
    public static void swap(int arr[], int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}