import java.util.Arrays;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private  int end = 0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }


    // here we insert item from last
    public boolean push(int value){
        if(isfull()){
            return false;
        }
        data[end++] = value ; // first assign the value on 0 index put first value then goes to next index and put next value
        return true;
    }

    private boolean isfull() {
        return end == data.length; // when my end point the same as the size of array
    }

    private boolean isEmpty(){
        return end == 0;
    }
    // its remove the item from first and shifted all item towards the left

    public int remove() throws Exception {
        if (isEmpty()) {
            throw  new Exception("The Queue is empty");
        }
        int removed = data[0]; // we remove the first element always
        // and shifted all things left
        for (int i = 1; i < end; i++) {  // end is the portion that take the value then increase
            data[i - 1] = data[i]; // basically the previous one is equal to the next one data[0] = data[1]
        }
        end--;
        return  removed;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Bro it is empty");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.print("END");
        System.out.println();
    }
}
