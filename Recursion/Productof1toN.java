/**
 * Productof1toN
 */
public class Productof1toN {

    public static void main(String[] args) {
     System.err.println(Productof1toNFun(5));
	}

    public static int Productof1toNFun(int n){
       if(n  <= 1){
	    return  1;
	   }
      return n * Productof1toNFun(n-1);
     
	    
	   
    }
}