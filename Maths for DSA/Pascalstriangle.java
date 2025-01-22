/**
 * Pascal'striangle
 */
public class Pascalstriangle {

    public static void main(String[] args) {
		int n = 6 ;
		int ans = 0 ;
		if(n > 0){
			ans+= 1 << (n-1);
		}
		System.out.println(ans);
    }
}