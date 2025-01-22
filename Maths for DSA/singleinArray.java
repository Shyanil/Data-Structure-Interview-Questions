/**
 * singleinArray
 */
public class singleinArray {

    public static void main(String[] args) {
        int arr[] = { 6 , 7 , 7 , 9 , 9 ,  6 , 5 , 2, 2};
        System.out.println(singleElement(arr));
    }

    public static int singleElement(int arr[]){
      int unique = 0 ;
      
	  for ( int n : arr){
		  unique ^= n; //  first converting 0 to binary then the numbers then xor 
//           unique = unique ^ 3
//     unique = 0000 ^ 0011  (XOR each bit)
//     unique = 0011  (which is 3 in decimal)  0 means false 1 means true see the copy

          
          
	  }
	  return unique;
    }
}