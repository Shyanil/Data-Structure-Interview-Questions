/**
 * ithbit
 */
public class ithbit {

    public static void main(String[] args) {
		int n = 275 ;  // binary - 111001000
		int x = 5; // remember start counting start with 1
        System.err.println(ithbitMethord(n, x));
        
    }

    public static int ithbitMethord(int n , int x){
        return 1 & (n >> (x-1));   // see the copy   // thats why we - this
    }
}