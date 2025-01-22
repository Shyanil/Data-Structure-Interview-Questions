import java.util.Arrays;

public class SuperArrayList<T> {   // here<T> is template and we working with Generics
    // this Arraylist can contains any thing number to String to char
    private Object[] data;   // Object class is highest class is inherited from everywhere 
    private static int DEFAULT_SIZE = 10;
    private int size;

    public SuperArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
       if (isFull()) {
          resize();
       }
      data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i  = 0 ; i < data.length ; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
       return size == data.length;
    }

    public T remove(){
       T dataT = (T) data[--size];
       return dataT;
    }

    public T get(int index){
       return (T) data[index];
    }

    public void set(int index , T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "SuperArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }
    public int size(){
        return size;
    }
}
