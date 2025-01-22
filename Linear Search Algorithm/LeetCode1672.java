
// https://leetcode.com/problems/richest-customer-wealth/description/
public class LeetCode1672 {
    public static void main(String[] args) {
        int arr[][]={{2, 3 ,4},
                    {4, 5 , 10}};
                    System.err.println(maximumWealth(arr));
        
    } /* 
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE ;
        for(int arr[] : accounts){
            int sum = 0;
            for ( int num : arr){
                sum += num;
            }
            if(sum > ans ){
                ans = sum ;
            }
        }
        return ans;
    } */
  static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int customer = 0 ; customer < accounts.length ; customer++){ // row
        int sum = 0;
                for(int wealthOnAcc = 0 ; wealthOnAcc < accounts[customer].length ;  wealthOnAcc++){
                        sum += accounts[customer][wealthOnAcc];
                }
                 if(sum > ans){
                 ans = sum ;
           }
        }
       
        return ans;
    }
}
