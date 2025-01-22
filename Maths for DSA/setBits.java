/**
 * setBits
 */
public class setBits {

    public static void main(String[] args) {
		int n = 9;
		int c = 0;
		// while(n > 0){
		// 	if((n & 1) == 1){
		// 		c++;
		// 	}
		// 	n = n >> 1;
		// }
        // System.err.println(c);
		// another way
        while(n > 0) {
			c++;
			n = n & (n - 1); // here its simple while loop thats going first 9  then 8 then goes until all n value become = 0 every time the count updated 
		}	
		System.err.println(c);
	
		
    }
}