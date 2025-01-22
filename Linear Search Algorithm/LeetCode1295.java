//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class LeetCode1295 {

    public static void main(String[] args) {
     int arr[]={12,345,2,6,7896,40};
     System.out.println(finalDigit(arr));    
    }

    static int finalDigit(int arr[]){
        int count = 0; // count all the nums in array
        for(int num : arr){
        if(even(num)){ // cheak is number is even or not
            count ++; 
        }
        }
        return count;
    }
    static boolean even(int num){
         int dightCheak = binayConvertNum(num);
         return dightCheak % 2 == 0; // cheaking number is and even 
    }
    static int binayConvertNum(int num){
         if(num < 0 ){
            num = num * -1; // change the input nagative number into postive
         }
         return (int)(Math.log10(num)) + 1; // take the number of digit into
         // 1s and 0s means binary then log base 2 (log10) then return 

    }

}