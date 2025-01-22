import java.util.Arrays;

public class BinarySearchAlgorithm4 {
    //34. Find First and Last Position of Element in Sorted Array

    public static void main(String[] args) {
        int arr [] = {5,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
        static public int[] searchRange(int[] nums, int target) {
            int ans[] = {-1,-1};
            ans[0]=helper(nums,target,true); // cheaking first occurrence
             if(ans[0] !=-1){
             ans[1]=helper(nums,target,false); // here false beacuse search range to 
             // find the last occurrence after finding the first one.
             // means false you dont need to cheak agin the first occurrence beacuse its already found thats why
             }
             return ans;
            
        }
       static int helper(int num[], int target, boolean findStartIndex){
            int ans = -1;
            int start = 0;
            int end = num.length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target < num[mid]){
                    end = mid - 1;
                } else if ( target > num[mid]){
                    start = mid + 1;
                } else {
                    ans = mid ; // here potential ans is found 
    
                    if(findStartIndex){ // but can be first index occurrence left or right side of mid
                        end = mid - 1; // for chraking  left side 
                    } else {
                        start = mid + 1; // for cheaking right side
                    }
                }
            }
            return ans ;
        }
    }

