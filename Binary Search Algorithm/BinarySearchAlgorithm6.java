public class BinarySearchAlgorithm6 {
    //33. Search in Rotated Sorted Array
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int targert = 5;
        System.err.println(mianApproch(arr, targert));
        
    }
    
     // main function found the how many time sorted and and 
    // return the target also
    static int mianApproch(int arr[],int targert){
        int Pervert = PervertCheak(arr);
        if(Pervert == -1){
            // Pervert not found thats why just noraml binery
            return BinarySearchAlgorithm(arr, targert, 0, arr.length-1);
        } else{
            if(targert == Pervert){
                return Pervert;
            } else if (targert >= arr[0]){
                // why beacuse for example //2,3 4,5,6,7,0,1,2,3,4 here target is 6
                // and target is big the the number after Pervert then i have to cheak only 
                // the number has before Pervert
                return BinarySearchAlgorithm(arr, targert, 0, Pervert-1);
            }
        }
        return BinarySearchAlgorithm(arr, targert, Pervert+1, arr.length-1); // then cheak after the Pervert beacase the target is small
    }

    // noraml binery serch 
    static int BinarySearchAlgorithm(int arr[],int targert,int start,int end){
    
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
        return -1;
    }
    

    // first we chaking thate 4 case 
    // in that case we able to find the 
    // Pervert - its a Largest number in array 
    // after that the number a incresing again 
    // but its work on when is rotated sorted array
    //[ 4,5,6,7,0,1,2] here Pervert is 7 because after that the number is incre.. again

    static int PervertCheak(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start <=end) {
            int mid = start + (end - start)/ 2;
            //1st case if the mie is grether then mid+1 
            if (arr[mid] > arr[mid+1]) {  // 2,3 4,5,6,7,0,1,2,for example mid = 7
                                        // then i dont need to cheak after mid 
              return mid;                          // beacuse Pervert biggest  number
                                        // after mid the numbers are less
                
            } else if ( arr[mid] < arr[mid-1]){  // 2,3 4,5,6,7,0,1,2,3,4 for example mid = 0 //mid - 1 means before index means   [ 4 3 2]
                                                  // for example 1 is index ans 3 value is target 
                                                  // mid - 1 means we cheak the 4
                     return mid-1;               // then i have cheak agin left side of array
                                                 // beacuse Pervert must be big 
                                                 // in this codition the after mid numbers are small

            } else if (arr[mid] < arr[start])  { // 2,3 4,5,6,7,0,1,2,3,4  here mid agin 7 and mid is bigger 
                    end = mid - 1;
                                               // we cheanking left side of mid
            } else {
                start = mid + 1;
            }
        } 
        return - 1;
        }
    }

