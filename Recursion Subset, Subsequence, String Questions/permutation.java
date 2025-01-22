/**
 * permutation
 */
public class permutation {

    public static void main(String[] args) {

        permutationF("" , "abc");
        
    }


    public static void permutationF(String p , String up){
        if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch =  up.charAt(0);
		for(int i = 0 ; i <= p.length() ; i++){
			String f = p.substring(0 , i);
			String l = p.substring(i , p.length());
			permutationF(f+ch+l , up.substring(1));    // its start from 2nd character and you see i passed already in ch first character
		}
    }
}