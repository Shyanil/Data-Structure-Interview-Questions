/**
 * KokoEatingBananas
 */
public class KokoEatingBananas {

    public static void main(String[] args) {

        int arr[] = {3,6,7,11};

        System.out.println(minEatingSpeed(arr,8));

        
    }
    public static int minEatingSpeed(int[] arr, int h) {
        int start = 0;
		int end = maxValue(arr);
		int totalValues = 0;
		while(start <= end){
			int mid = start + (end - start)/2;
			 totalValues  = nextHour(arr,mid);
			 if(totalValues <= h){
				 end = mid - 1 ; // if i am index 4 and my min value is 6 but in left iside might have more less value the complte within 8 hours
			 } else {
				start = mid + 1;
			 }
		}
		return start;
    }
	public static int nextHour(int arr[], int hours){
		int total = 0;
		for(int i = 0 ; i < arr.length ; i++){
			total+=Math.ceil( (double) arr[i] / (double) hours);
		}
		return total;
	}
	public static int maxValue(int arr[]){
		int max = 0;
		for(int i = 0 ; i < arr.length ; i++){
		  max = Math.max(max, arr[i]);
		}
		return max;
	}
}