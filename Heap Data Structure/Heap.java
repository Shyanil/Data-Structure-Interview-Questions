import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {
     public ArrayList<T> list;

    Heap(){
         list = new ArrayList<>();
     }


     public void swap(int first , int second){
        T temp = list.get(first);
        list.set(first , list.get(second));
        list.set(second , temp);
     }

     public int parent(int index){
         return (index - 1)/2;
     }

     public int left(int index){
         return (2 * index) + 1;
     }

     public int right(int index){
         return (2 * index) + 2;
     }

     public void insert(T value){
         list.add(value);
         unHeap(list.size() - 1);
     }

    private void unHeap(int index) {
        if(index == 0){
            return;
        }

        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index , p);
            unHeap(p);
        }
    }

    public  T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from Empty heap");
        }

        T first = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0 , last);
            downHeapMin(0);
        }

        return first;
    }

    private void downHeapMin(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if(min != index){
            swap(min , index);
            downHeapMin(min);
        }

    }

    public ArrayList<T>  heapSort() throws Exception{
        ArrayList<T> tArrayList = new ArrayList<>();
        while (!list.isEmpty()){
            tArrayList.add(this.remove());
        }
        return tArrayList;
    }

    public void unSortedHelperMin(int[] arr){
        list.clear();
        for (int num : arr){
            list.add((T) Integer.valueOf(num));
        }
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            downHeapMin(i);
        }
        // Now print the heap list
        System.out.println("Heap after creation: " + list);
    }

    public void unSortedHelperMax(int[] arr){
        list.clear();
        for (int num : arr){
            list.add((T) Integer.valueOf(num));
        }
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            downHeapMax(i);
        }
        // Now print the heap list
        System.out.println("Heap after creation: " + list);
    }

    private void downHeapMax(int index) {
        int largest = index;
        int left = left(largest);
        int  right = right(largest);

        if(left < list.size() && list.get(left).compareTo(list.get(largest)) > 0){
            largest = left;
        }

        if(right < list.size() && list.get(right).compareTo(list.get(largest)) > 0){
            largest = right;
        }

        if(largest != index){
            swap(index , largest);
            downHeapMax(largest);
        }


    }

}
