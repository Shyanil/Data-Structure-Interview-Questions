import java.util.ArrayList;

public class Main extends Exception{
    public static void main(String[] args) throws Exception {
        Heap<Integer> integerHeap = new Heap<>();
        for (int i = 7; i < 12; i++) {
            integerHeap.insert(i);
        }

        integerHeap.insert(1);
        integerHeap.insert(2);

        ArrayList<Integer> integerArrayList = integerHeap.heapSort();
        System.out.println(integerArrayList);

        int[] unsortedArray = { 10, 20, 5, 15, 30, 8, 25 , 1};
        System.out.println("Creating a heap from unsorted array:");
        integerHeap.unSortedHelperMin(unsortedArray);  // Create heap from unsorted array  and minimum item is first
        integerHeap.unSortedHelperMax(unsortedArray);
    }
}
