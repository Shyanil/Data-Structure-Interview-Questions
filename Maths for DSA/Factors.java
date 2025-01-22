import java.util.ArrayList;

/**
 * Factors
 */
public class Factors {
     public static void main(String[] args) {

        FactorsofNumber(100);
        
     }
     // here time and space complexcity O(sqrt(n))
     public static void FactorsofNumber(int n) {
        ArrayList list = new ArrayList<>();
		for(int i = 1 ; i < Math.sqrt(n) ; i++){  // here its  i start from i because the 0 not divide by anu number 
			if(n % i == 0){
				if(n / i == i){
					System.out.println(i + " ");
				}
				
				else {
                    System.out.println(i + " ");
				  list.add(n/i);
				}
			}
		}
		
		for(int i = list.size() - 1 ; i >= 0 ; i--){
			System.out.println(list.get(i) + " ");
		}
     }
     
}