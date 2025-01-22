/**
 * SumOfDigit
 */
public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(SumOfDigitfun(5));
    }

    public static int SumOfDigitfun(int n){
        if(n<=1){
			return 1;
		}
		return n+SumOfDigitfun(n-1);
    }
}