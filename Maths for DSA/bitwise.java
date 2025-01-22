/**
 * bitwise
 */
public class bitwise {

    public static void main(String[] args) {
        int number = 40;
		System.err.println(evenOrodd(number));
    }
    
     public static boolean evenOrodd(int number){
        return  (number & 1 ) == 1;   // if we do (and) 1 with any number and we get 1 at last then this is odd number other wise its a even because 1 is odd number and 0 is even
     }    
}     // like this 1001 & 0001 we add 0 before 1 beacuse fill this and you saw 1 & 1 is 1 means then number is odd 