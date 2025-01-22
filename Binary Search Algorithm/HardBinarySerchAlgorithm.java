/**
 * HardBinarySerchAlgorithm
 */

 // THIS CODE IS NOT PERFECT BEACUSE OF OPPS IMPLAMATION REQUIRED
 // https://leetcode.com/problems/find-in-mountain-array/description/
 // 1095. Find in Mountain Array
public class HardBinarySerchAlgorithm {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,3,1};
    int targert = 3;
    System.out.println(serch(arr, targert));
    
  }
  static int serch(int arr[],int targert){
   int Peak = peakIndexInMountainArray(arr); // its cheak from first half and 2nd half and found the largest elemt 
   int firstTry = OrderAgnosticBinarySearch(arr, targert, 0, Peak);  // then its cheak largest element  means right side cheak
   if (firstTry != -1) {
     return firstTry;
   }
   return OrderAgnosticBinarySearch(arr, targert, Peak+1, arr.length-1);  // its cheak left side meand largest element+1 then 
      // means cheaks for accending order
  }
  static int peakIndexInMountainArray(int arr[]){
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        int mid = start + (end - start)/2;
        if (arr[mid] > arr[mid+1]) {
            end = mid;
        } else{
            start = mid + 1;
        }
    }
    return start;
  }
  static int  OrderAgnosticBinarySearch (int arr[], int targert , int start , int end){
    boolean isAss = arr[start] < arr[end];
    while (start <= end) {
        int mid = start + (end - start)/2;
        // this must be import part or its print nothing beacuse dome example mid == target
        if(arr[mid] == targert){
            return mid;
        }
            if (isAss) {
              
                    if (targert < arr[mid]) {
                        end = mid - 1;   
                    } else if (targert > arr[mid]){
                        start = mid + 1;
                    }
                } else {
                    if (targert > arr[mid]) {
                        end = mid - 1;   
                    } else if (targert < arr[mid]){
                        start = mid + 1;
                    }
                }
            
        }
        return -1;
    }
  }
    
