/**
 * Power
 */
public class Power {

    public static void main(String[] args) {
		int base = 2;
		int power = 5;
		
		int ans = 1;
		
		while(power >0){
			if((power & 1 )== 1){
				ans *= base; // only power last value is 1 in binary then update ans
			}
			base *= base; //here 2 multiply with 2 all the time 
			 power = power >> 1;
		}
		System.out.println(ans);
    }
    // first base updating all time and always 1 in any number then update
    
}