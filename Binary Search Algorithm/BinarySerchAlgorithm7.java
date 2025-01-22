public class BinarySerchAlgorithm7 {
    //540. Single Element in a Sorted Array
    public static void main(String[] args) {
        int arr []= {1,1,2,2,3,3,4,4,8,8,10};
        System.out.println(helper(arr));
        
    }
    static int helper(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { // we dont do = beacse the when start ans end beacome equals thats is ans
            int mid = start +  (end - start)/2;
            if(mid % 2 == 0) { // here i only write mid means only mid index is even 
               if(arr[mid] == arr[mid+1]){  // its cheaks right side
                 start = mid + 1;  // here we first cahnge the start beacuse when even case the 
                                  // the mid - 1 index aleays diffrent for even number 
                                //  dont need to find  left side beacse its else do 
               } else {   // here we cheaking left side 
                 end = mid ; // we dont do end = mid - 1 beacuse 
                            // beacuse there is possbilty the single number(the question says)  
                             // lays on mid - 1 index thats why
                             // its work for only odd mid 
                             // becasuse its follow even odd index means even ood even odd evn oddd al time 
               }
            } else{
                if(arr[mid] == arr[mid - 1]){ // we alreday cheak later elemet for even mid
                  start = mid + 1;                         // and index ares   even odd
                                        // 1,1,2,3,3,4,4,8,8 here know mid - 3 then cheak for mid +1 means another 3
            }  else {
                end = mid - 1 ;   // for after redduing example mid is 1 index and 1 value after spaceing then we have cheak the only
                                // 1 1 2 we dont end = mid like even case beacuse single number 2 lyes after mid 
                                // thats is rule for odd case 
            }
        }
    }
    return arr[start]; // when all pointer beacyse start and end means last approch when 1112
                     // case  end = mid - 1 ; this work means my end become 2 and 
                     // i alredy redunce 1 1  left side thats biner serch do comman case
                     // then 2 is mid 2 is start and 2 is end thats ans
}
}
