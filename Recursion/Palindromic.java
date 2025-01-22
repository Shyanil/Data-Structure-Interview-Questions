import java.util.*;

public class Palindromic {
    public static void main(String[] args) {
      String  s = "iTopiNonAvevanoNipoti";
              s=s.toLowerCase();

      System.out.println(fun(s));
      
  }
  
  public static boolean fun(String s){
    if(s.length() <= 1){
      return true;
    }
    
    char start  = s.charAt(0);
    char end = s.charAt(s.length() - 1);
    if(start != end){
      return false;
    } else {
      return fun(s.substring(1 , s.length() - 1));
    }
  }
}