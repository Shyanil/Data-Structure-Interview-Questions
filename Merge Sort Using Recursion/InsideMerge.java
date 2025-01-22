/**
 * InsideMerge
 */
public class InsideMerge {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100,4,3,2};
        mergeInside(arr,0,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        
    }
}
    public static void mergeInside(int arr[] , int s , int e){
        if(e - s == 1){
			return;
		}
		int m = s+(e-s)/2;
		mergeInside(arr,s,m);
		mergeInside(arr,m,e);
		
		mergeH(arr,s,m,e);
    }
	public static void mergeH(int mix[], int s, int m , int e){
		int arr[] = new int[e-s];
		int i = s;
		int j = m;
		int k = 0;
		
		while(i < m && j < e){
			if(mix[i] < mix[j]){
				arr[k] = mix[i];
				i++;
			} else {
				arr[k] = mix[j];
				j++;
			}
			k++;
		}
		while(i < m){
			arr[k] = mix[i];
			i++;
			k++;
		}
		
		while(j < e){
			arr[k] = mix[j];
			j++;
			k++;
		}
		
		 for(int l = 0; l<arr.length ; l++){
              mix[s+l] = arr[l];
         }
	}
}