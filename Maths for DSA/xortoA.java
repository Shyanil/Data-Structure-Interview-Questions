import java.util.List;

/**
 * xortoA
 */
import java.util.*;;
public class xortoA {
    
    public static void main(String[] args) {
     int a =  10;
	 List<int[]> ans = ansZ(a);
     for(int[] fan: ans){
        System.out.println("The a value is " + fan[1] + " " + "the Xor of a " + fan[0]);
     }
    }

    public static List<int[]> ansZ(int a){
        List<int[]> ans = new ArrayList<>();
		int xorValue = 0;
        for(int i = 0 ; i <= a ; i++){
         xorValue ^=i;
         ans.add(new int[] {xorValue , i});
        }
        return ans;
    }
}
