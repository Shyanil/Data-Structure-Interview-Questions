/**
 * recursionS
 */
public class recursionS {

    public static void main(String[] args) {

        // System.out.println(Skip("abckjlhagkakhgfkjynhsa"));
        // Skip("", "abckjlhagkakhgfkjynhsa");
		
          System.out.println(skipappnotApple("rsafsdjkoappeooo"));
		  

        
    }
    static String Skip(String Up){
        if(Up.isEmpty()){
			return "";
		}
		char ch = Up.charAt(0);
		if(ch == 'a'){
			return Skip(Up.substring(1));
		} else {
			return ch+ Skip(Up.substring(1));
		}
    }
    // now we print the data uisng two parameters
    static void Skip(String p , String Up){
        if(Up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = Up.charAt(0);
		if(ch == 'a'){
			Skip(p,Up.substring(1));
		}
		else {
			Skip(ch+p , Up.substring(1));
		}
		
		
    }
	static String skipApple(String Up){
	   if(Up.isEmpty()){
		   return "";
	   }
	   
	   if(Up.startsWith("apple")){
		   return skipApple(Up.substring(5));
	   } else {
		   return Up.charAt(0) + skipApple(Up.substring(1));
	   }
	   
	}
    
	// Now Skip the apple the the String contains apple
	static String skipappnotApple(String Up){
		if(Up.isEmpty()){
			return "";
		}
		if(Up.startsWith("app") && !Up.startsWith("apple")){
			return skipappnotApple(Up.substring(3));
		} else {
			return Up.charAt(0) +  skipappnotApple(Up.substring(1)); 
		}
	}
	
}