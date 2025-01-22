/**
 * Main
 */
public class Main {
   public static void main(String[] args) {
      // There is Object class that inherited Throwable class and Throwable class subClass Exception 
      // And there is two Exception are two type checked and not checked 
      // if you getting a exception in compile time thats call checked exception  file not found
      // and if you get runtime exception that compiler not able to detect not checked  Exception divided by Zero
       
      int a = 10;
      int b = 0;
      try {
       divided(a, b);
      } catch (Exception e) {   // its has subClass ArithmeticException that checks that 
         System.out.println(e.getMessage());
      }
      finally{
        System.out.println("Always run try or catch");
      }

   }

   // function also here i pass our owen message

   static void divided(int a , int b) throws ArithmeticException{
    if(b==0){
        throw new ArithmeticException("No we can't do that here 2nd Number is 0");
    }
    else{
        System.out.println(a/ b);
    }
   }
    
}