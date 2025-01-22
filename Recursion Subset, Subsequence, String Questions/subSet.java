/**
 * Subsequence
 */
public class Subsequence {

    public static void main(String[] args) {
        System.out.println(SubsequenceMethord("", "abc"));
    }

    static String SubsequenceMethord(String p , String up){
        if(up.isEmpty()){
            return p;
        }
		char ch = up.charAt(0);
		String a = SubsequenceMethord(p+ch, up.substring(1));
        String b = SubsequenceMethord(p, up.substring(1));
        return a + " " + b;
        
    }
}