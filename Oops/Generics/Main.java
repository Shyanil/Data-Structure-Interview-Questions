import wildCardsExample.*;
import java.util.*;;
public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i = 0 ; i < 5 ; i++){
           list.add(i  + 1);
        }
        System.out.println(list.remove());  // its give the remove index
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.set(0, 10);
        System.out.println(list);


        SuperArrayList<String> sList = new SuperArrayList<>();
        for(int i = 0 ; i < 15 ; i++){
            sList.add("a" + i);
        }

        System.out.println(sList);
        System.out.println(sList.get(5));
        sList.set(5, "SHYANIL");
        System.out.println(sList);
        System.out.println(sList.remove());
        System.out.println(sList.size()); 

        SuperArrayListChar<Character> listChar = new SuperArrayListChar<>();     // its only take the Character

        for(int i = 0;i < 10 ; i++){
            listChar.add('a');
        }
        System.out.println(listChar);


        
    } 


    public static void getList(List<? extends Number> list){
        // this is wild card example here i either pass Number or its subclass
    }


}
