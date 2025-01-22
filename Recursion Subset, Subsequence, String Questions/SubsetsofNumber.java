import java.util.List;
import java.util.*;;
/**
 * SubsetsofNumber
 */
public class SubsetsofNumber {

    public static void main(String[] args) {
		int arr[] = {1 , 2 , 3};
		List<List<Integer>> list = subsets(arr);
		System.out.println(list);
		// space and time complexcity is O(n * 2^n) for time 2^n no of subset of n
		// and we are creating new subset of original one that take the n complexity
		// in space 2^n this is we have 2^n no of subset so the space also 2^n 
		// and n every subset taking how much space O(n) space beacuse the first the elemnts is n
	} 



     public static List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> outer = new ArrayList<>();
		 outer.add(new ArrayList<>());
		 for(int num : nums){
			 int n = outer.size();
			 for(int i = 0 ; i < n ; i++){
				 List<Integer> inner = new ArrayList<>(outer.get(i));
				 inner.add(num);
				 outer.add(inner);
			 }
		 }
		 return outer;
    }
}