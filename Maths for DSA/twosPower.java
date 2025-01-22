/**
 * 2sPower
 */
public class twosPower {

    public static void main(String[] args) {
		int n = 16 ;
		boolean ans = (n & (n-1)) == 0; // 16 == 10000000 and 15 = 111111 we get 0 remember always cheek binary computer
		System.err.println(ans);
    }
}
