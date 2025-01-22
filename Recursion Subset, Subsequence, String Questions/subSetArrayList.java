import java.util.ArrayList;

/**
 * SubsequenceArrayLIST
 */
public class SubsequenceArrayLIST {

    public static void main(String[] args) {

        System.out.println(subssqunac("","abc"));
        
    }
    public static ArrayList<String> subssqunac(String p , String up){
      if(up.isEmpty()){
		  ArrayList<String> list = new ArrayList<String>();
		  list.add(p);
		  return list;
	  }

    // 
It works with addAll because it merges entire lists, while it doesn't work with add because add expects a single String, but you're trying to add a List<String>, causing a type mismatch.
         char ch = up.charAt(0);
       ArrayList<String> left = subssqunac(p+ch,up.substring(1));
	         ArrayList<String> right = subssqunac(p,up.substring(1));
        left.addAll(right);
         return left;		

	   
    }
}