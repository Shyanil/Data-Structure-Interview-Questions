/**
 * SubsetsofNumberDuplicate
 */

 import java.util.*;
public class SubsetsofNumberDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,2,2};
        List<List<Integer>> list = subsetsWithDup(nums);
        System.out.println(list);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        quickSort(nums,0, nums.length - 1);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start  = 0;
        int end = 0;
        for(int i = 0 ; i < nums.length ; i++){
            start  =  0;  // reset the start otherwise its carry old start value
            if(i > 0 && nums[i] == nums[i-1]){
               start = end + 1;  
            }
            int n = outerList.size();
            end = n - 1;
            for(int j = start ; j < n ; j++){
                List<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(nums[i]);
                outerList.add(innerList);
            }
        }
         return outerList;
}

   public static void quickSort(int[] arr, int low , int hi){
    if(low>=hi){
        return;
    }
    int s = low;
    int e = hi;
    int m = s+ (e - s)/2;
    int pivot = arr[m];

    while(s<=e){
        while(arr[s] < pivot){
            s++;
        }
        while(arr[e] > pivot){
            e--;
        }
        if(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
     quickSort(arr, low , e);
     quickSort(arr, s , hi);
   }
}
