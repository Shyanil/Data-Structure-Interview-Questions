import java.util.List;
import java.util.*;
/**
 * permutationListTWO
 */
public class permutationListTWO {


    public List<String> permutations(String p, String up) {
		if(up.isEmpty()){
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		List<String> listAll = new ArrayList<>();
		char ch = up.charAt(0);
		for(int i = 0 ; i <= p.length() ; i++){
			String f = p.substring(0,i);
			String e = p.substring(i , p.length());
			listAll.addAll(permutations(f + ch + e , up.substring(1)));
		}
		return listAll;
		
	}

    public List<List<String>> generatePermutations(String[] arr) {
		String corsponds = "";
		for(String str:arr){
			corsponds+=str;
		}
		List<String> list = permutations("",corsponds);
		List<List<String>> output = new ArrayList<>();
		for(String listone : list){
			List<String>  curList = new ArrayList<>();
			curList.add(listone);
			output.add(curList);
		}
		return output;
	}


    public static void main(String[] args) {
        permutationListTWO sol = new permutationListTWO();
        String[] input = {"a", "b", "c"}; // Example input array
        List<List<String>> result = sol.generatePermutations(input);
        System.out.println(result);
    }
}