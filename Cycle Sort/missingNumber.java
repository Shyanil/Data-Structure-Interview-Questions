public class missingNumber {
  //https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int arr[]={3,0,1};
       
        System.out.println(missingNumberM(arr));
    }
	public static int missingNumberM(int arr[]){
		int i = 0; // i cheaks form start index
		while(i < arr.length) // i goes to N times
		{
			int curr = arr[i];
			if(arr[i] < arr.length  && arr[i] != arr[curr]){ // means if the index = the numbers  and the number is less then N(arr.length)
				 swap(arr, i , curr); // for 3,0,1 here right now index of 3 = 0 , 0 = 1 , 1 = 2 
				                     // these cheaks arr[i] != arr[curr] and then swap here 3 = 0 , 0 = 1 the 
			} else {
				i++;
			}
		}
		for(int j = 0 ; j< arr.length ; j++){
			if(arr[j] != j){
				return j ; // means in these code 0 is given so the index value and the number must be same
				           // i have to find misssing number so if the give array the index is not equal to the number 
						   // then return index beacuse i mention here index = number 
						   // so if i return index then we able to return alos number
			}
		}
		return arr.length;   // means if N = 4 given but in array N is not then that is become missing number
	}
	public static void swap(int arr[], int a , int e){
		int temp= arr[a];
		arr[a] = arr[e];
		arr[e] = temp;
	}
}