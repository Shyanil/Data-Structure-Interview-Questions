public class BinarySearchAlgorithm2 {
    // binary serch but first find ing that numbers are  sascending order or not 

    public static void main(String[] args) {
        int arr[]= {90,-4,-3,-2,10,80,70,60,40};
        int targert = 10;
        int ANS = deBS(arr, targert);
        System.out.println(ANS);
        
    }
    static int deBS(int arr[], int targert){
        int start = 0;
        int end = arr.length - 1;

        boolean isAss = arr[start] < arr[end];
      
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(targert == arr[mid]){
                return mid;
            }
            if (isAss) {
                if (targert < arr[mid]) {
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            } else{
                if (targert > arr[mid]) {
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }
         
        }
        return -1;
    }
}
