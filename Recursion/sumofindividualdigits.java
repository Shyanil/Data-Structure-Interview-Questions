/**
 * sumofindividualdigits
 */
public class sumofindividualdigits {

    public static void main(String[] args) {
        int num = 1234;
		System.out.println(sumofindividualdigitsfun(num));
    }
    public static int sumofindividualdigitsfun(int n){
        if(n==0){
			return 0;
		}
		return sumofindividualdigitsfun(n/10) + n%10;
    }
}

