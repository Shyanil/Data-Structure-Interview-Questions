
package BubbleSort;
public class BubbleSort {
    public static void main(String[] args) {
        
    }
    static void bubble(int arr[]){
        // for cheaking the array leangth throw index
        // define the boolean value if array is sorted then imdeity break
        boolean isTrasfer ;
        for(int i = 0 ; i<arr.length ; i++){
            isTrasfer = false ; 
            for(int j = 1 ; j <= arr.length - i - 1 ; j++){  // here j loop starts from 1 beacuse we compere the previces elemnt is bigger or smaller
                if(arr[j] < arr[j-1]){                     // if bigger then swap small emelmet come first
                 int temp = arr[j];
                 arr[j] = arr[j-1];
                 arr[j-1] = temp;
                 isTrasfer = true ; // means my array is not sorted we perform swap
            }
        }
        if(!isTrasfer){
            break;  // if arrays is sorted break loop
        }
    }
}
}
