public class BinarySearchAlgorithm8leetcode {
    //81. Search in Rotated Sorted Array II
    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
        
    }
    static boolean search(int[] arr, int target) {
        if(arr == null || arr.length == 0){
            return false;
        }
        int prevent = findPrevet(arr);
        if (prevent == -1) {
            Binerysearch(arr, target, 0, arr.length-1);
        } else {
            if(target == prevent){
                return true;
            } else {
                Binerysearch(arr, target, 0, prevent-1);
            }
        }
        return Binerysearch(arr, target, prevent+1, arr.length - 1);

    }
    static boolean Binerysearch(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;

    }

    // find prevet duplicate case

    static int findPrevet(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
             int mid = start + (end - start)/2;
             // cheaking first conidtion
             if(mid > end  && arr[mid] > arr[mid+1]){
                 return end;
             } else if (arr[mid] < arr[mid-1]) { // finding prevent thats why we cheak after mid - 1;
                return mid - 1;
             } else  {
                // the start and end is equal to mid then ignore start and end 
                if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                    // for example my start is prevet then i can't ignore start
                    if(start > mid && arr[start] > arr[start+1]){ // here only start or mid is index and arr[star] and arr[mid] is number
                        return start; // if my start is prevent 
                    }
                    start++;
                     if (end < mid && arr[end] < arr[end-1]) {  // here we finding prevent rebemer that roated array last number must be small 
                      return end-1;               // that why we cheak for end - 1 means before end index its prevet or not

                    }
                    end--;
                
                }
                //left hand side is shorted so pivout shoud be right
             } if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){  //  1st case mid is bigger then arr[start]
                                                                                               // means left side of mid are s,all number
                                                                                            // and prevet is big number
                                                                                               // if start and mid same then ignore
                                                                                               // 3rd case we know all numbers after 
                                                                                               //prevet is samll so ignore
                start = mid + 1;
             } else {
                 //right hand side is shorted so pivout shoud be left
                end = mid - 1;
             }
        }
        return - 1;
    }
}
