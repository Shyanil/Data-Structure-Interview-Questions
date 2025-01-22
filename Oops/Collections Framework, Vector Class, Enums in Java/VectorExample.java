import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        // in vector multiple thread can't access same object in ArrayList the threads are pointing to the same object 
        // but in Vector if thread 1 is working on Object creation then thread 2 wait for access the same object 
        List<Integer> listVector = new Vector<>();
        listVector.add(1);
        listVector.add(1);
        listVector.add(5);
        listVector.add(4);
        System.out.println(listVector);  // its take to much time so we use ArrayList 

        
    }
}
