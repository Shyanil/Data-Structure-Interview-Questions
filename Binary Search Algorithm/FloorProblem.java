
import java.util.Arrays;

/**
 * FloorProblem
 */
public class FloorProblem {
   
    //smallest element in array thats less or equals to target 
    public static void main(String[] args) {
        int arr [] ={20,30,10,40,50};
        Arrays.sort(arr);
        int targert = 49;
        int ANS = FloorProblemBS(arr, targert);
        System.out.println(ANS);
        //10 , 20 , 30 , 40 , 50 
        
    }
    static int FloorProblemBS(int arr[], int targert){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (targert < arr[mid]) {
                end = mid - 1;
            } else if (targert > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return arr[end%arr.length];
    }
}

