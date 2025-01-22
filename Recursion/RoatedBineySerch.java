/**
 * RoatedBineySerch
 */
public class RoatedBineySerch {

    public static void main(String[] args) {
        int arr[] = {5,6,7,1,2,3,4};
        int target = 4;
        int s = 0;
        int e = arr.length-1;
        int ans = serch(arr,target,s,e);
        System.out.println(ans);
        
    }

    public static int serch(int arr[] , int target , int s , int e){
        if(s>e){
          return -1;
        }
		int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
		if(arr[s] <= arr[m]){
			if(target >= arr[s] && target <= arr[m]){
				return serch(arr,target,s,m-1);
			} else {
                return serch(arr,target,m+1,e);			
				}
		}
			if(target >= arr[m] && target <= arr[e]){
				                return serch(arr,target,m+1,e);			

			}
			return serch(arr,target,s,m-1);

    }
}