/**
 * newPrime
 */
public class newPrime {

    public static void main(String[] args) {
      int n = 16;
      for(int i = 0 ; i <= n ; i++){
        System.out.println("the number" + i + " " + isprime(i));
      }

    }

    public static boolean isprime(int n){
      if(n <=1){
	    return false;
	  }

      int c = 2;
      while(c * c <= n){  // here actually we are doing that c = square root of n but here we both side square thats why its become this 
		if(n % c == 0){
			return false;  // for future help - https://chatgpt.com/c/55b8297a-0240-41ff-93ec-f49af1ee59f1
		}
         c++;  // two thing 1 ) when c * c less then or equal to n then only while loop works 
           // then c normal start from 0 and c++ c become the c = 3 and its not worked in while loop  
            // and its excits		   
	  }
      return true;	  
    }
}