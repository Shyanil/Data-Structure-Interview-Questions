import java.util.ArrayList;
import java.util.List;

/**
 * permutationList
 */
public class permutationList {

    public static void main(String[] args) {
        List<String> ans = permutationListF("", "abc");
        System.out.println(ans);

    }

    public static List<String> permutationListF(String p , String up) {
		if(up.isEmpty()){
			List<String> ans1 = new ArrayList<>();
			ans1.add(p);
            return ans1;
		}
		List<String> listAns = new ArrayList<>();
		char ch = up.charAt(0);
		
		for(int i = 0 ; i <= p.length() ; i++){
			String f  = p.substring(0 , i);
			String l  = p.substring(i , p.length());
			listAns.addAll(permutationListF(f+ch+l , up.substring(1)));
		}

       return listAns;
		
	}
}