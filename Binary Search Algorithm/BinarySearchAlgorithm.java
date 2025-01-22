public class BinarySearchAlgorithm {
   // find the index of the target number in BinarySearchAlgorithm
    public static void main(String[] args) {
       int arr [] = {20,30,40,50,60,70,80};
       int targert = 80 ;
       int ANS = BinarySearch(arr, targert);
       System.out.println(ANS);
    }
    static int BinarySearch(int arr[], int targert){
        int start = 0 ;
        int end = arr.length - 1;

         while (start <= end) {
            int mid = start + (end - start) / 2;   // i do this rule why not i directly do start + end / 2
            // because in some time array is big and some some its may exceed  the int limit
         if(targert < arr[mid]){
            end = mid - 1;
         } else if ( targert > arr[mid]){
            start = mid + 1 ;
         } else {
            return mid;
         }

        }
        return - 1;
    }
}
