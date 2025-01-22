import java.sql.Array;
import java.util.ArrayList;

/**
 * SubsequenceArrayLISTAsci
 */
public class SubsequenceArrayLISTAsci {

    public static void main(String[] args) {
        System.out.println(subseqList("", "abc"));
        
    }

    public static ArrayList<String> subseqList(String p , String a){
     if(a.isEmpty()){
	   ArrayList<String> list = new ArrayList<String>();
       list.add(p);
       return list;		
	 }
    char ch = a.charAt(0); 
	 ArrayList<String> leftAscii = subseqList(p + (ch + 0), a.substring(1));
     ArrayList<String> rightAscii = subseqList(p , a.substring(1));	 
	 leftAscii.addAll(rightAscii);
	 return leftAscii;
	
    }
}