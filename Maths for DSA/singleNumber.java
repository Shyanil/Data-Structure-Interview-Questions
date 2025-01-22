/**
 * singleNumber
 */
public class singleNumber {

    public static void main(String[] args) {
		int nums[] = {2,2,3,2,4,4,4,5,5,5};
        System.out.println(function(nums));
    }

    public static int function(int nums[]){
        for(int num:nums){
		 if(num % 3 != 0){
			return nums[num];
		 }
		}
        return -1;
    }
}