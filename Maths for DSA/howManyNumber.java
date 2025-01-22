/**
 * howManyNumber
 */
public class howManyNumber {
  // how many times 2 multiply to perform 10 in binary 
  // how many number in binary in 10 
    public static void main(String[] args) {
      int n = 6 ;
      int count = 0 ;
      while( n > 0){
         
		  if(n !=0){
            n = n >> 1;
			  count++;
		  }
	  }
       // System.err.println(count);
       formula(345, 2);
    }
    //  why we have formula 

    public static void formula(int num , int base){

      int ans = (int) (Math.log(num) / Math.log(base)) + 1;
      System.out.println(ans);

    }
}