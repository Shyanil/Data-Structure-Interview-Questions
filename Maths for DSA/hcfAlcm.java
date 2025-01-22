/**
 * Gcd
 */
public class hcfAlcm {

    public static void main(String[] args) {

        System.out.println(gcdF(7 , 49));
		System.out.println(lcmF(7 , 49));

    }

    public static int gcdF(int n , int p){  // just see this please - https://chatgpt.com/c/66d945b5-a33c-8013-a0d1-6d9d14719a10
        if(n == 0){
            return p;
        }

        return gcdF(p % n, n);  //Euclidean algorithm

    }
	
	public static int lcmF(int n , int p){
		
		return n * p / gcdF(n , p);
	}
}