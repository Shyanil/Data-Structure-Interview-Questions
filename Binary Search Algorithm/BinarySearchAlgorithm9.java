public class BinarySearchAlgorithm9 {
    //Find the Rotation Count in Rotated Sorted array
    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotation(arr));
    }
    static int countRotation(int arr[]){
        int prevent = findPrevet(arr);
        return prevent+1;

    }
    static int findPrevet(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return end;
            } else if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            } else if (arr[mid] <  arr[start]){  // 1 2 3 4 8 0 1 2
               end = mid - 1;
            } else {
                start = mid + 1; //arr[mid] >= arr[start] if  // 1 2 3 4 8 0 1 2 here mid is 8 then you thick we ignore this but 
                                             /// but must be shorten by  f(mid > start && arr[mid] > arr[mid+1]){
            }
        }
        return - 1;
    }
    static int findPrevetDuplicate(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
        int mid = start + (end - start)/2;
         if(mid > end && arr[mid] > arr[mid+1]){
            return end;
         } else if (mid > start && arr[mid] < arr[mid-1]){ // here we ignore case if start is pevet
            return mid-1;
         } else {
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(mid < start && arr[start] > arr[start+1]){
                    return start;
                } 
                start++;
                 if (mid > end && arr[end] < arr[end-1] ){
                    return end-1;
                }
                end--;
            }
         }
         if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
            start = mid + 1;
         } else {
            end = mid -1;
         }

    }
    return - 1;
}
}
