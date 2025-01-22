
import java.util.*;
/**
 * letterCombinations
 */
public class letterCombinations {

    public static void main(String[] args) {

        System.out.println( letterCombinationsF("23"));
        System.out.println( counter("", "23"));
    }


     public static List<String> letterCombinationsF(String digits) {
		 if(digits.isEmpty()){
			 return new ArrayList<>();
		 }
		 List<String> list = helper("", digits);
		 return list;
	 }


     public static List<String> helper (String p , String up){
		 if(up.isEmpty()){
			 List<String> list = new ArrayList<>();
			 list.add(p);
			 return list;
		 }
		 
		 List<String> listAll = new ArrayList<>();
		 int digits = up.charAt(0) - '0';
		 String mapping[] = {"abc" , "def" , "ghi" , "jkl" ,"mno" , "pqrs" , "tuv" , "wxyz"};
		 String letters =  mapping[digits - 2];
		 
		 for(int i = 0 ; i < letters.length() ; i++){
			 char ch = letters.charAt(i);
			 listAll.addAll(helper(p+ch , up.substring(1)));
		 }
         return listAll;
		 
	 }
	 
	 public static int counter (String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        
        int count = 0 ;
        int digits = up.charAt(0) - '0';
        String mapping[] = {"abc" , "def" , "ghi" , "jkl" ,"mno" , "pqrs" , "tuv" , "wxyz"};
        String letters =  mapping[digits - 2];
        
        for(int i = 0 ; i < letters.length() ; i++){
            char ch = letters.charAt(i);
            count = count + counter(p+ch , up.substring(1));
        }
        return count;
        
    }
}