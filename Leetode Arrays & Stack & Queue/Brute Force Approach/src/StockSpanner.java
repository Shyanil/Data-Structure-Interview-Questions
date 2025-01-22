import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
    private static List<Integer> list;
    public StockSpanner() {
        list = new ArrayList<>();
    }

    public static  int next(int price) {
        list.add(price);
        int count = 1;
        for (int i = list.size() - 2 ; i >= 0 ; i--){
            if(list.get(i) <=  price){
                count++;
            } else  {
                break;
            }
        }
        return count;
    }

}
