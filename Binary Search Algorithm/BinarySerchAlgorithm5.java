public class BinarySerchAlgorithm5 {
    //852. Peak Index in a Mountain Array
    public static void main(String[] args) {
        int arr[] = {0,10,450,5,2}; // here need to understand array first increse or decarse or first decrese or increse but
         //  0,10,450,5,2,750 not woekd beacuse there is no part
         // we have to change to sort array
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    // here is no target also no a partcular assending order array
    // still doing binery serch because array is sorted
   static  public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
         while (start < end) {  // here not use = beacause see below
          int mid = start + ( end - start)/2;
          // first cheaking that array is descending order 
          if (arr[mid] > arr[mid+1]) {  // here example 1 2 3 4  5  4 3 2 1  for example mid is 5
             end = mid ;               // then cheak  mid is grethen then mid + 1 means next index
                                      // yes then this is a descending array part
                                      //and mid beacome the end 
                                      // beacuse i  have to find the largest elment in array
                                      // its cheak left side to find largest elemt
                                      
          } else {
            start = mid + 1; //  here its cheak for largest elemet assending
         
          }   
          // no duplicate value in array
          /* why we cheaking for left side agin right side
           *  1) for example the array is 1 2 3 4 5 6 7 8 9 3 2 1
           *   here mid examle 6 but largest number lies on right still 
           *  then i have to cheak right side
           *    start = mid + 1; thats gonna cheaking 
           *   2)  for example the array is 7 6 5 4 3 2 1 2 3 4 5 6  
           *   here mid example is 2
           *   and largest number lies on left 
           *   then applled this one  end = mid 
           *    these cheak for left side
           */

           // at the end or  descending or  assending start and end will be point the largest elemt
           
       }
       return start; // return end
    }
}
