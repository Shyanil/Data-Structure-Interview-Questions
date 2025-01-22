/**
 * binarySqrt
 */
public class binarySqrt {

    public static void main(String[] args) {
        int n = 25;
        int p = 3;
        System.out.println(sqrt(n , p));
    }

    public static double sqrt(int n , int p){
     int s = 0;
     int e = n;
     double rootvalue = 0.0;
	 while(s<=e){
		 int m = s + (e - s)/2;
		 if(m * m > n ){
			 e = m - 1;
		 } else if (m * m < n){
			 s = m + 1;
		 } else {
		   return m;
		 }
	 }
	 double incr = 0.1;
	 for(int i = 0 ; i < p ; i++){
		 while(rootvalue * rootvalue <=n){
			   rootvalue+=incr;
		 }
		 rootvalue -=incr;
		 incr/=10;
	 }
	 return rootvalue;
    }
}