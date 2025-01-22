import java.util.List;
import java.util.*;;
/**
 * numberOfdice
 */
public class numberOfdice {

    public static void main(String[] args) {

        Dice("", 4);
        System.out.println(DiceList("", 9, 5));
        System.out.println( DiceCount(4));
    }


    public static void Dice(String p ,  int target){
        if(target == 0 ){
            System.out.println(p);
			return;
		}
	
		for(int i = 1 ; i <= 6 && i <= target ; i++){
			Dice(p+i , target -i);
           
		}
       
    }

    public static List<String> DiceList(String p , int k , int target){
        if(target == 0){
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		List<String> nlist = new ArrayList<>();
		for(int i = 1 ; i <= k && i <= target ; i++){
			nlist.addAll(DiceList(p + i , k , target - i));
		}
		return nlist;
		
    }

    public static int DiceCount(int target){
        if(target == 0 ){
			return 1;
		}
	    int count = 0;
		for(int i = 1 ; i <= 6 && i <= target ; i++){
		count+=DiceCount(target -i);
           
	}
     return count;       
    }
}