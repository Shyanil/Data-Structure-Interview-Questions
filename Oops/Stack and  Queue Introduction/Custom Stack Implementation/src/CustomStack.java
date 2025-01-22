import java.util.Arrays;

public class CustomStack {

    // first creating array
    protected int[] data;
    // now give a default size that can't change also use final because i don't want to change
    private static final int DEFAULT_SIZE = 10;

    private int pointer = -1;    // we take a pointer default 1
    // if nothing created then we just use DEFAULT_SIZE
    public CustomStack() {
        this(DEFAULT_SIZE); // HERE this calling another constructor that take integer argument
    }
    // here if define the size then we create new array based on size
    public CustomStack(int size) {
        data = new int[size];
    }

    // Now we insert items
    public  boolean isInsert(int value){
        if(isFull()){
            return  false;
        }
        data[++pointer] = value; // here we increase the pointer step by step and the value is added
        return true;
    }

    protected boolean isFull() {
        return pointer == data.length - 1;  // if the pointer same as  the size array
    }

    public int isPop() throws Exception {
        if(isEmpty()){
            throw  new Exception("Please don't delete from empty Stack");
        }

        int value = data[pointer];
        data[pointer] = 0;  // what i item we remove make this 0
        pointer--;
        return  value;

    }

    private boolean isEmpty(){
        return pointer == -1;  // is no item insert
    }

    public int isPeek(){
        return data[pointer];
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "data=" + Arrays.toString(data) +
                ", pointer=" + pointer +
                '}';
    }
}
