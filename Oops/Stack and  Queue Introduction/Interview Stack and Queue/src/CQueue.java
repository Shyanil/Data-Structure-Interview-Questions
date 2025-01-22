import java.util.Arrays;

public class CQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    private int LastP = 0;
    public CQueue() {
        this(DEFAULT_SIZE);
    }

    public CQueue(int size) {
        data = new int[size];
    }

    protected void push(int x) {
        if(isFull()){
          int temp[] = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            LastP= 0;
            data = temp;
        }

        data[LastP++] = x;
    }

    protected boolean isFull(){
        return LastP == data.length;
    }

    protected boolean isEmpty(){
        return LastP == 0;
    }

    protected int pop() {
      if(isEmpty()){
          System.out.println("Stack is Empty");
      }
      int removed = data[0];
        for (int i = 1; i < LastP; i++) {
            data[i-1]= data[i];
            i++;
        }
        LastP--;
      return removed;
    }

    protected int top() {
      return data[0];
    }

    @Override
    public String toString() {
        return "CQueue{" +
                "data=" + Arrays.toString(data) +
                ", LastP=" + LastP +
                '}';
    }
}
