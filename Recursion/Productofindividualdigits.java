/**
 * Productofindividualdigits
 */
public class Productofindividualdigits {

    public static void main(String[] args) {
        System.out.println(Productofindividualdigitsfun(55));
    }
    public static int Productofindividualdigitsfun(int n){
        if(n%10 == n){
			return n;
		}
		return (n%10) * Productofindividualdigitsfun(n/10);
    }
}