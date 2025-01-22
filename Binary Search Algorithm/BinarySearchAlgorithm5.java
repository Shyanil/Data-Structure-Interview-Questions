public class BinarySearchAlgorithm5 {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
            100, 130, 140, 160, 170};
            int target = 10;
            System.out.println(mainApproch(arr, target));
    }
   

    //now finding the main approch  using box/chnunk and that update the start and end values 

    static int mainApproch(int arr[], int target){
        // cheaking box/chnunk first with 0 and 1 indexes
      int start = 0;
      int end = 1;
     // if target not find in 1 indx then i have to cheak another box/chunk
     // but in that time i update the cheaking box size
      while (target > arr[end]) {
        int newStart = end + 1; // changing the old start
        end = end + (end -start+1)*2 ; // here the pura explan cheak docs data link-(https://docs.google.com/document/d/19WrVcJWU1SGl3Ldd2wLiFRtU3s_HhLlRTcqH7i3_PBc/edit)
        start = newStart;
      }
      return BinarySearchA(arr, target, start, end);
    }

    //normal BinarySearchA without using start and end partciculerly
    static int BinarySearchA(int arr[],int target,int start,int end){
        while (start<=end) {
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = end +  1;
            } else {
                return mid;
            }
        }
        return - 1;
    } 
}
