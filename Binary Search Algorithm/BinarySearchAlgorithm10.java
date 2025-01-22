public class BinarySearchAlgorithm10 {
    //410. Split Array Largest Sum
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k = 2;
        System.out.println(findLargestSum(arr, k));
    }
     /*Input: nums = [7,2,5,10,8], k = 2
Output: 18 */
      public static int findLargestSum(int arr[],int k){
        int start = 0;
        int end = 0;  // here we dont do arr.length - 1 beacuse here we dont apply directly binery serch
        // first we update the start and end then we  apply  binery serch

        for(int i = 0 ; i< arr.length ; i++){
            // now updating start
           //  question is find the  largest sum and then minimized.
            // rule is the  largest sum of of individual array is its theis numsber
            // beacsause its broken into pcies 
           // [7],[2],[5],[10],[8] like that here we have to find minmum number max
              start = Math.max(start, arr[i]);
              end += arr[i]; // and the largest sum sum of all numbers 
              // for example larhest sum is 32 then end pointer go theere to start pointer 
              // for example start pointer is 8
       
        } 

        // then apply binery serch
        while (start < end) {
             int mid = start + (end - start)/2;
             int sum = 0 ;
             int pecies = 1; // if array size is four then we have divied in for pices
             // then ways is 1
             for (int num : arr){
                if(sum + num > mid) { // example mid = 18 we break it and adding
                // [ 7,2,5] then   we try to add 8 but here sum beaome more then mid
                  sum = num ; // now we agin stat counteing sum after new number means  [ 8 , 10] from 8
                  pecies++; // here its braeak into 2 part
                }
                else {
                    sum +=num; // keep adding
             } 
             }
             if(pecies > k) {// given part we have to brak is become beigger then
                            // if we try to match out with target sum (largest sum of any subarray is minimized.) 
                start = mid+1;         // means one time for example sum is 17
                            // [7 , 2 , 5] then break into another part beacuse if we add 
                            // any extra number then my new sum > target sum
                            //[7, 2, 5, 8] == 22 then its brak part [8] then if i try to add 10 then its beaome
                            // 18 but target is 17 then its brak [10]
                            // now its become [7,2,5] [8] [10]
                            // but target is 17 
                            // then we plus the sums target
                            // then we  plus the mid value 
                            // beacuse we always here for mid then goes 
                            // binery sech rule
                            // then agin adding 
                            // if agin pices is big then agin mid+1 goes on

             }else{
                end = mid;
                        }                        
                        
                        } 
                        return start; // at the and stat and end bceome same;

      }
}
