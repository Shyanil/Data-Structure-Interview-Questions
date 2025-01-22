import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // previous we we creating a clone of object 
        Human sHuman = new Human(1 , "shyanil");
        Human sHuman2 = new Human(sHuman);
        System.out.println(sHuman2);


        // but now 
        Human cHuman = (Human) sHuman.clone();
        System.out.println(cHuman);

        // now the final
        System.out.println();
        System.out.println("fINAL " + sHuman);

        System.out.println(Arrays.toString(cHuman.arr));

        // now i change only cHuman
        cHuman.arr[2] = 100;

        // now printing the main one and don't even modify the sHuman

        System.out.println(Arrays.toString(sHuman.arr));  // its also change the main one thats why its shallow copy
        // in shallow copy reference variable are point to the old object no primitives don't create new area   
        // but they create new area for  primitives data types 

         // its is for deep copy testing so please open depp copy methord
         Human sHuman3 = (Human) sHuman.clone();
         sHuman3.arr[1] = 100;
         System.out.println(Arrays.toString(sHuman3.arr));
         System.out.println("The mAIN aRR");
         System.out.println(Arrays.toString(sHuman.arr));

    }
}
