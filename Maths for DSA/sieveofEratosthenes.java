/**
 * sieveofEratosthenes
 */
public class sieveofEratosthenes {

    public static void main(String[] args) {
      int n = 40;
      boolean isprime[] = new boolean[n+1];
      isprimeSieve(n, isprime);  
    }

    public static void isprimeSieve(int n , boolean isprime[]){
       for(int i = 2 ; i * i  <= n ; i++){
		  if(!isprime[i]){
			  for(int j = i * 2 ; j <= n ; j+=i){  // here the multiple of the number is removes
				  isprime[j] = true;
			  }
		  } 
	   }
	   
	   // its to simple if you follow this - https://chatgpt.com/c/bfa95245-fa68-41d1-91ca-0a7ab06387da
      for(int i = 2 ; i <= n ; i++){
		  if(!isprime[i]){
			System.out.println(i + " ");  
		  }
	  }	   
    }
}