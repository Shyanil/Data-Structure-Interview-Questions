/**
 * newtonraphsonMethod
 */
public class newtonraphsonMethod {

    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    public static double sqrt(int n){
        double x = n ;
		double root;
		// https://chatgpt.com/c/00e2bd77-8b12-420a-9625-113120bdb628
		while(true){
			root = 0.5 * (x + n / x );  // (x + n / x ) / 2;
			
			if(Math.abs(root - x) < 0.5){
				break;
			}
			x = root;  // evertime its updated becuse its called agin agin
			// Why it works: By updating x with root, 
			 // the loop is set up to refine the estimate further in the next iteration. 
			 // If you don't update x, the loop will get stuck because x will not change, so root - x will always be the same.
		}
		return root;
    }
}