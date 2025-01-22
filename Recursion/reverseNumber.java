/**
 * reverseNumber
 */
public class reverseNumber {
   public static void main(String[] args) {

       System.out.println(reverseNumberfun(12345));
    
   }

   public static int reverseNumberfun(int n){
	   int num = (int) Math.log10(n)+1;
	   return helper(n , num);

   }
   public static int helper(int n , int digits ){
	   if(n%10 == n){
		   return n;
	   }
	   int rem = n % 10;
	   return rem * (int) Math.pow(10 , digits - 1) + helper(n/10 , digits - 1);
    
   }
    
}